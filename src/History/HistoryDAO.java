package History;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ConnectionManager.ConnectionManager;

public class HistoryDAO {
	
	static Connection currentCon = null; 
	static ResultSet rs = null; //It is a table of data representing a database result set, generated by executing a statement that queries the database. A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row. The next method moves the cursor to the next row and it returns false when there are no more rows in the ResultSet object
	 	
	public static HistoryBean getHistory(HistoryBean bean, String userName) { //preparing some objects for connection 
		
		Statement stmt = null;
		 		 
		 String searchQuery = "select * from ADMINISTRATOR.HISTORY where username='" + userName + "'";  //Write the query
		 		 
		 System.out.println("Query: "+searchQuery); 
		 
		 try { 
			 //connect to DB 
			 currentCon = ConnectionManager.getConnection(); 
			 stmt=currentCon.createStatement(); 
			 
			 rs = stmt.executeQuery(searchQuery); 
			 
			 boolean more = rs.next();
			
			 
			 // if user does not exist set the isValid variable to false 
			 if (!more) { 
				 System.out.println("Sorry, your History is not valid"); 
				 bean.setValid(false); 
			 } 
			 //if history exists set the isValid variable to true 
			 else if (more) { 
				
				 String clt =  rs.getString("current_login_time"); //currentLoginTime
				 String llt =  rs.getString("last_login_time"); //lastLoginTime
				 String lpct = rs.getString("last_password_change_time"); //lastPswChangeTime
				 String llw =  rs.getString("wrong_login_attempt"); //lastLoginWrong
				 
				 
				 bean.setCurrentLoginTime(rs.getTimestamp("current_login_time"));
				 bean.setLastLoginTime(rs.getTimestamp("last_login_time"));
				 bean.setLastPswChangeTime(rs.getTimestamp("last_password_change_time"));
				 bean.setWrong_login_attempt(rs.getInt("wrong_login_attempt"));
				 bean.setValid(true);
				 
				 System.out.println("HISTORY: " + clt + ", " + llt + ", " + lpct + ", " + llw);
				 
			 } 
		 } 
		 catch (Exception ex) { 
			 System.out.println("Account failed: An Exception has occurred! " + ex); 
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