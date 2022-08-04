package overloading_asmt;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Todo td=new Todo();
		TodoValidation tv=new TodoValidation();
		
		//getting info from users
		System.out.println("Enter name");
		String name=in.next();
		String validations=tv.validation(name);
		td.setName(validations);
		System.out.println(td.getName());
		
		
		System.out.println("Enter user name");
		String userName=in.next();
		String userValidations=tv.userNameValidation(userName);
		td.setUserName(userValidations);
		System.out.println(td.getUserName());
		
		System.out.println("Enter password");
		String password=in.next();
		String passwordValidations=tv.passwordValidation(password);
		td.setPassword(passwordValidations);
//		System.out.println(td.getPassword());
		
		

		 System.out.println("Enter No of Tasks");
	        int n = in.nextInt();
	        
	        ArrayList al=new ArrayList(n);
//	        String arr[] = new String[n];
	        for(int j=0;j<n;j++)
	        {
	            System.out.println("Enter the Task");
	            String s=in.next();
	            al.add(j, s);
//	            arr[j]=in.next();
	        }
	        System.out.println("ToDo are :");
	        
	        for (Object object : al) {
				System.out.println(object);
			}
//	        for (String values : arr) {
//	            System.out.println(values);
//	        }
			
		
		
	}

}
