package com.qsp.app.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseUtil1 
{
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getconnection() throws SQLException
	{
		Connection con=null;
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaya?USER=root&PASSWORD=7200");
	
		return con;
	}

}
