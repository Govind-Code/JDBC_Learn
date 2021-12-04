package Library_ManagementAPP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOpration {
	
	
public static boolean addBook(Books ob)
{
	
	boolean f=false;
	
	try
	{
		
		Connection cn=CP.CreateC();
		
	    String query="insert into library(bname,bauthor,bstatus) value(?,?,?)";
		
		PreparedStatement ps=cn.prepareStatement(query);
		
		ps.setString(1, ob.getBookName());
		ps.setString(2, ob.getBookAuthor());
		ps.setString(3, ob.getBookStatus());
		
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
		
		Connection cn=CP.CreateC();
		
		String query="select * from library";
		
		Statement st=cn.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String author=rs.getString(3);
			String status=rs.getString(4);
			System.out.println("Book ID : "+id);
			System.out.println("Book Name : "+name);
			System.out.println("Book Author : "+author);
			System.out.println("Book Status : "+status);
			
			System.out.println("****************************************");
			
		}
		
		
		
		
	}
	
	catch(Exception e)
	{
		
	}
}

public static boolean deleteData(int id)
{
	boolean f=false;
	
	try {
		Connection cn=CP.CreateC();
		
		String query="delete from library where bid=?";
		PreparedStatement ps=cn.prepareStatement(query);
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
		f=true;
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return f;
	
}

public static boolean updateData(Books ob,int id)

{
	boolean f=false;
	
	try {
		
		Connection cn=CP.CreateC();
		
		String query="update library set bname=?,bAuthor=?,bstatus=? where bid=?";
		
		PreparedStatement ps=cn.prepareStatement(query);
		ps.setString(1, ob.getBookName());
		ps.setString(2, ob.getBookAuthor());
		ps.setString(3, ob.getBookStatus());
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
