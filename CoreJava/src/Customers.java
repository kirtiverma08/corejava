
import java.util.Scanner;

public class Customers {
	 
	 
	Customers()
	{
		
	}
	
	public Connection getConnection()
	{
		
	}
	
	public void insertCustomer(String name, String city, String contact) {
		
		}
	
	public void getCustomer() 
	{
	  
	}
	
	public void updateCustomer(int id,String city) 
	{
		
	}
	
	public void deleteCustomer(int cid) 
	{
		
	}
	
	public static void main(String[] args) {
		Customers c=new Customers();
		String city;
		int cid;
		
		System.out.println("************** Global Marketing Ltd. **************");
		System.out.println("----------- Customer Management System ----------");
		while(true)
		{
		System.out.println("Press 1 for New Customer \t Press 2 to Display Customers");
		System.out.println("Press 3 for Update Customer \t Press 4 to Delete Customer");
		System.out.println("Press 5 for Exit"); 
			
		Scanner s=new Scanner(System.in);
		int option=s.nextInt();
		
		switch(option)
		{
		case 1: System.out.println("Enter Customer Name, City & Contact no :");
		        String name=s.next();
		        city=s.next();
		        String contactno=s.next();
			c.insertCustomer(name,city,contactno);
			break;
		case 2: c.getCustomer();
				break;
		case 3: System.out.println("Enter CustomerId & City to be Updated:");
        		cid=s.nextInt();
        		city=s.next();
			c.updateCustomer(cid,city);
			break;
		case 4: System.out.println("Enter CustomerId  to be Deleted:");
			cid=s.nextInt();
			c.deleteCustomer(cid);
			break;
		case 5: System.out.println("Application Terminated");
		 	System.exit(0);
		
		default: System.out.println("Invalid Selection");
		          break;
		}
		
		
		}
	}

}
