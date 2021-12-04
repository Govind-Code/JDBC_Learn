package com_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connection_provider {
	

	static Connection con;
	
	public static Connection creatC()
	{
		try {
			
			// load driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String user="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/data_management";
					
			
			con=DriverManager.getConnection(url,user,password);
			
			
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}

	
	

}
