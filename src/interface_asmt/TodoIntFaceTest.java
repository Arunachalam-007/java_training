package interface_asmt;

import java.util.Scanner;

import abstract_asmt.TodoLogic;

public class TodoIntFaceTest {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter name");
			String name=in.next();
			TodoLogic tl=new TodoLogic();
			tl.nameLogic(name);	
			
			System.out.println("Enter user name");
			String userName=in.next();
			tl.userNameLogic(userName);
			
			System.out.println("Enter password");
			String password=in.next();
			tl.passwordLogic(password);
			
			tl.todoApp();
	}

}
