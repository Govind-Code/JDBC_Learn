package Library_ManagementAPP;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	
	static Connection cn;
	
	public static Connection CreateC()
	{
		// load Driver
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String user="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/library_management";
		
		cn=DriverManager.getConnection(url,user,password);
		
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	    return cn;
	}

}
