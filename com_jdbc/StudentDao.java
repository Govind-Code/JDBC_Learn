package com_jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	
	
	public static boolean insertData(Students st)
	{
		
		//create connection with Connection provider Class
		
		boolean f=false;
		
		try {

			//create connection with Connection provider Class
			
			
			Connection cn=Connection_provider.creatC();
			
		//fire queries with prepared statement
			
			String query="insert into student(sname,sphone,scity) value(?,?,?)";
			
			PreparedStatement ps=cn.prepareStatement(query);
			ps.setString(1, st.getStudentName());
			ps.setInt(2,st.getStudentPhone());
			ps.setString(3,st.getStudentCity());
			
			// execute your data
			
			ps.executeUpdate();
			
			f=true;
			
	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}
	
	
	public static void showData()
	{
		
		try {
			
			String query="select * from student";
			Connection cn=Connection_provider.creatC();
			
			
			
			Statement stmt=cn.createStatement();
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next())
				
			{
			  String id=rs.getString(1);
			  String name=rs.getString(2);
			  int phone=rs.getInt(3);
			  String city=rs.getString(4);
			  
			  System.out.println("Student ID :"+id);
			  System.out.println("Student Name : "+name);
			  System.out.println("Student Phone_No : "+phone);
			  System.out.println("Student Address : "+city);
			  
			  System.out.println("*********************************************");
			
			}
			
			
		
			
			
			
			
		}
		catch(Exception e)
		{
			
		}
	}


	public static boolean deleteData(int userId) {
		// TODO Auto-generated method stub
		
		boolean f=false;
		try {
			
			Connection cn=Connection_provider.creatC();
			
			String query="delete from student where sid=?";
			
			PreparedStatement ps=cn.prepareStatement(query);
			ps.setInt(1,userId);
			
			// execute query
			
			ps.executeUpdate();
			
			f=true;
			
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return f;
	}


	public static boolean updateData(Students st,int id) {
		// TODO Auto-generated method stub
		
		boolean f=false;
		try
		{
			
			Connection cn=Connection_provider.creatC();
			
			String query="update student set sname=?,sphone=?,scity=? where sid=?";
			
			PreparedStatement ps=cn.prepareStatement(query);
	
			ps.setString(1, st.getStudentName());
			ps.setInt(2, st.getStudentPhone());
			ps.setString(3, st.getStudentCity());
			ps.setInt(4, id);
			
			ps.executeUpdate();
			
			f=true;
			
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
		
	}


	

}
