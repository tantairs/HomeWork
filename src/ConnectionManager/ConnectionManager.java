package ConnectionManager;

import java.sql.*; 

/*
 *	In the pasted code, Replace:
    -"DataSource" with your Data Source name
    -"username" with your SQL Server username
    -"password" with your SQL Server password 
 * 
 * */

public class ConnectionManager { 
	static Connection con; 
	static String url; 
	
	public static Connection getConnection() {
		
		try { 
			//Load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//url = "jdbc:odbc:" + "DataSource";
			url = "jdbc:oracle:thin:@localhost:1521:orcl";//!!!
			
			try { 
				// assuming your SQL Server's username is "hr" and password is "tongji"
				con = DriverManager.getConnection(url,"USER1","tongji1");
				System.out.println("CONNECTION OK");
			} 
			catch (SQLException ex) { 
				ex.printStackTrace(); 
			} 
		} 
		catch(ClassNotFoundException e) { 
			System.out.println(e + "\nERROR CONNECTION");
		} 
		return con;
	}
	
	public static CallableStatement prepareProcedure(String procedureName, int paramNumber) throws SQLException
	{
		String query = "begin ADMINISTRATOR." + procedureName + " (";
		
		for (int i = 0; i < paramNumber; ++i) {
			if (i != 0) query += ",";
			query += "?";
		}
		query += "); end;";
		System.out.println("Query is == " + query);
		CallableStatement cs = con.prepareCall(query);
		return cs;
	}
	
	
	
	
	
}