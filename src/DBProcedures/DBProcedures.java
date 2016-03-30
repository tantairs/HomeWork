/**
 * 
 */
package DBProcedures;

import java.sql.CallableStatement;
import java.sql.SQLException;

import ConnectionManager.ConnectionManager;

/**
 * @author Nicolas
 *
 */
public class DBProcedures {
	
	public static void updateHistory(String username) {
		/*
		try {
		  CallableStatement cs = ConnectionManager.prepareProcedure("update_history", 1);
		  cs.setString(1, username);
		  cs.executeUpdate();
		  cs.close();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		*/
	}
	
	public static void updateStatus(String username) {
		try {
		  CallableStatement cs = ConnectionManager.prepareProcedure("update_status", 1);
		  cs.setString(1, username);
		  cs.executeUpdate();
		  cs.close();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void addWrongAttempt(String username) {
		try {
		  CallableStatement cs = ConnectionManager.prepareProcedure("add_wrong_attempt", 1);
		  cs.setString(1, username);
		  cs.executeUpdate();
		  cs.close();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void addBeneficiary(String account_number, String beneficiary_account_number, String bank_name, Float limit, String name) {
		try {
		  CallableStatement cs = ConnectionManager.prepareProcedure("add_beneficiary", 5);
		  cs.setString(1, account_number);
		  cs.setString(2, beneficiary_account_number);
		  cs.setString(3, bank_name);
		  cs.setFloat(4, limit);
		  cs.setString(5, name);
		  cs.executeUpdate();
		  cs.close();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void editBeneficiary(Integer beneficiary_id, Float limit, String name) {
		try {
		  CallableStatement cs = ConnectionManager.prepareProcedure("edit_beneficiary", 3);
		  cs.setInt(1, beneficiary_id);
		  cs.setFloat(2, limit);
		  cs.setString(3, name);
		  cs.executeUpdate();
		  cs.close();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void createTransaction(String account_number, Integer beneficiary_id, String transaction_name, Float amount, Integer mode_id) {
		try {
		  CallableStatement cs = ConnectionManager.prepareProcedure("create_transaction", 5);
		  cs.setString(1, account_number);
		  cs.setInt(2, beneficiary_id);
		  cs.setString(3, transaction_name);
		  cs.setFloat(4, amount);
		  cs.setInt(5, mode_id);
		  cs.executeUpdate();
		  cs.close();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
