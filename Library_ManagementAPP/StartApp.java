package Library_ManagementAPP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartApp {
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("LIBRARY MANAGEMENT APPLICATION");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			
			System.out.println("ENTER 1 TO ADD     BOOKS");
			System.out.println("ENTER 2 TO SHOW    BOOKS");
			System.out.println("ENTER 3 TO DELETE  BOOKS");
			System.out.println("ENTER 4 TO UPDATE  BOOK");
			System.out.println("ENTER 5 TO EXIT FROM HERE ");
			
			System.out.println("Enter Your Choice here");
			
			int choice=Integer.parseInt(br.readLine());
			
			if(choice==1)
			{
			
				// add details 
				System.out.println("Enter the Book Name :");
			    String bname=br.readLine();
			    System.out.println("Enter the Book Auther :");
			    String bAuther=br.readLine();
			    System.out.println("Enter the Book Status :");
			    String bStatus=br.readLine();
			    
			    Books ob=new Books(bname, bAuther, bStatus);
			    
			    boolean b=DBOpration.addBook(ob);
			    if(b)
			    {
			    	System.out.println("add successfully");
			    }
			    
			    else
			    {
			    	System.out.println("something wrong");
			    }
			    
			  
			  
				
				
				
			}
			else if(choice==2)
			{
				//show books in library
				
				DBOpration.showData();
				
			}
			else if(choice==3)
			{
                System.out.println("Enter Book Id to Delete : ");	
                
                int id=Integer.parseInt(br.readLine());
                
               boolean b= DBOpration.deleteData(id);
               
               if(b)
               {
            	   System.out.println("data delete successfully");
               }
               else
               {
            	   System.out.println("something went wong");
               }
			}
			
			else if(choice==4)
			{
				
				// update data
				System.out.println("Enter Book Id to Update");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter the Book Name :");
			    String bname=br.readLine();
			    System.out.println("Enter the Book Auther :");
			    String bAuther=br.readLine();
			    System.out.println("Enter the Book Status :");
			    String bStatus=br.readLine();
			    
			    Books ob=new Books(bname, bAuther, bStatus);
			    
			      boolean b= DBOpration.updateData(ob,id);
			      
			      if(b)
			      {
			    	  System.out.println("your successfully updated ");
			      }
			      
			      else
			      {
			    	  System.out.println("something went wrong");
			      }
			}
			else if(choice==5)
			{
				// exit here 
				
				System.out.println("thanks for using this Application");
				
				break;
			}
			
			
			
		
			
			
			
		}
	}

}
