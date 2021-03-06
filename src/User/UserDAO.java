package User;

import java.sql.*;

import ConnectionManager.ConnectionManager;
import DBProcedures.DBProcedures;

public class UserDAO {

	static Connection currentCon = null; 
	static ResultSet rs = null; //It is a table of data representing a database result set, generated by executing a statement that queries the database. A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row. The next method moves the cursor to the next row and it returns false when there are no more rows in the ResultSet object
	 
	public static UserBean login(UserBean bean) { //preparing some objects for connection 
		 Statement stmt = null; 
		 String username = bean.getUsername(); 
		 String password = bean.getPassword(); 
		 String searchQuery = "select * from ADMINISTRATOR.LOGIN where username='" + username + "'"; 
		 
		 // "System.out.println" prints in the console; Normally used to trace the process 
		 System.out.println("Your user name is " + username); 
		 System.out.println("Your password is " + password); 
		 System.out.println("Query: "+searchQuery); 
		 
		 try { 
			 //connect to DB 
			 currentCon = ConnectionManager.getConnection();
			 stmt=currentCon.createStatement();
			 
			 //Unblock account if it's time
			 DBProcedures.updateStatus(username);
			 
			 rs = stmt.executeQuery(searchQuery); 
			 
			 boolean more = rs.next(); 
			 //set isValid false by default
			 bean.setValid(false);
			 
			 // if user does not exist set the isValid variable to false 
			 if (!more) { 
				 System.out.println("Sorry, you are not a registered user! Please sign up first"); 
			 }
			 //if user exists set the isValid variable to true 
			 else if (more) { //you exists in the database
				 bean.setStatus(rs.getString("status"));
				 String dbPwd = rs.getString("password");
				 
				 System.out.println("DB PASSWORD IS " + dbPwd);
				
				 if (bean.getStatus().equals("BLOCKED")) { // your account is blocked
					 System.out.println("Sorry, your account is blocked! Please contact your bank");
				 }
				 else if (!dbPwd.equals(password)) { //Wrong password enter: augment wrong_attempt and go to invalid page
					 System.out.println("Wrong password");
					 DBProcedures.addWrongAttempt(username);
				 }
				 else { // you are logged in, set valid to true
					 //update current login time
					 System.out.println("login ok");
					 DBProcedures.updateHistory(username);
					 bean.setValid(true); 
				 }
				
			 } 
		 } 
		 catch (Exception ex) { 
			 System.out.println("Log In failed: An Exception has occurred! " + ex); 
		 } 
		 //some exception handling 
		 finally { 
			 if (rs != null) { 
				 try { 
					 rs.close();
				 } 
				 catch (Exception e) {} 
				 rs = null; 
			} 
			if (stmt != null) { 
				try { 
					stmt.close(); 
				} 
				catch (Exception e) {} 
				stmt = null; 
			} 
			if (currentCon != null) { 
				try { 
					currentCon.close(); 
				} 
				catch (Exception e) {} 
				currentCon = null; 
			} 
		 } 
		 return bean;
	 } 
}