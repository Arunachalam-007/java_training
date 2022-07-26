package abstract_asmt;

import java.util.Scanner;

public class TodoLogic {
	Scanner in=new Scanner(System.in);
	TodoAbstract ta=new TodoAbstract();
	TodoAbstractValidationChild tav=new TodoAbstractValidationChild();
	
	public void nameLogic(String name) {
		String validations=tav.nameValidation(name);
		ta.setName(validations);
		System.out.println(ta.getName());
		
	}
	public void userNameLogic(String userName) {
		String userValidations=tav.userNameValidation(userName);
		ta.setUserName(userValidations);
		System.out.println(ta.getUserName());
	}
	public void passwordLogic(String password) {
		String passwordValidations=tav.passwordValidation(password);
		ta.setPassword(passwordValidations);
	}
	
	public void todoApp() {
		System.out.println("Enter No of Tasks");
	     int n = in.nextInt();
	     String arr[] = new String[n];
	     for(int j=0;j<n;j++)
	     {
	         System.out.println("Enter the Task");
	         arr[j]=in.next();
	     }
	     System.out.println("ToDo are :");
	     
	     for (String values : arr) {
	         System.out.println(values);
	     }
		
	}

}
