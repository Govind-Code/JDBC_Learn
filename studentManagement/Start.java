package studentManagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com_jdbc.StudentDao;
import com_jdbc.Students;

public class Start {
	
	static Students st;
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		
		
    while(true)
    {
    	System.out.println("Enter 1 for insert the data");
    	System.out.println("Enter 2 for show the data");
    	System.out.println("Enter 3 for delete the data");
    	System.out.println("Enter 4 for update the data");
    	System.out.println("Enter 5 for exit");
    	
    	int choice=Integer.parseInt(br.readLine());
    	if(choice==1)
    	{
    		// data insertion
    		
    		System.out.println("Enter Student Name : ");
    		String name=br.readLine();
    		System.out.println("Enter Student Phone_no :");
    		int phone=Integer.parseInt(br.readLine());
    		System.out.println("Enter Student City : ");
    		String city=br.readLine();
    		
    		// create student object to store student
    		
    	      st=new Students(name, phone, city);
    		
    	boolean answer=StudentDao.insertData(st);
    	if(answer)
    	{
    		System.out.println("Student is Added Successfully");
    	}
    	else
    	{
    		System.out.println("Student is not added Successfully");
    	}
    	
    		
    		
    		System.out.println(st);
    		
    	}
    	else if(choice==2)
    	{
    	
    		
    		
    		StudentDao.showData();
    		
    		
    	}
    	else if(choice==3)
    	{
    		// delete data
    		
    		System.out.println("Enter the Student Id to delete:");
    		
    		int userId=Integer.parseInt(br.readLine());
    		
    		boolean b=StudentDao.deleteData(userId);
    		if(b)
    		{
    			System.out.println("Delete Successfully");
    		}
    		else
    		{
    			System.out.println("Something went wrong");
    		}
    		
    		
    		
    		
    	}
    	else if(choice==4)
    	{
    		// update operation
    	
    		System.out.println("Enter the Student Id to Update : ");
    		int id=Integer.parseInt(br.readLine());
    		System.out.println(" ***********  Write student updated details ***********");
    		System.out.println("Enter The Student Name : ");
    		String name=br.readLine();
    		System.out.println("Enter the Student Phone :");
    		int phone=Integer.parseInt(br.readLine());
    		System.out.println("Enter the Student Address  : ");
    		String city=br.readLine();
    		
    		st=new Students(name, phone, city);
    		
    		
    		
    		boolean b=StudentDao.updateData(st,id);
    		
    		if(b)
    		{
    			System.out.println("your data seccessfully updated");
    		}
    		else
    		{
    			System.out.println("something went wrong");
    		}
    		
    	}
    	
    	else if(choice==5)
    	{
    		break;
    	}
    	
    }
    System.out.println("thank you very much for using this consol application . bye,bye");
		
	}

}
