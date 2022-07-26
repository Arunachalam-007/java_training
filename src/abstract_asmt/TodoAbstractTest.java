package abstract_asmt;

import java.util.Scanner;

public class TodoAbstractTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name");
		String name=in.next();
//		TodoAbstract ta=new TodoAbstract();
		TodoLogic tl=new TodoLogic();
		tl.nameLogic(name);
		
		
		System.out.println("Enter user name");
		String userName=in.next();
//		TodoLogic tl1=new TodoLogic();
		tl.userNameLogic(userName);
		
		System.out.println("Enter password");
		String password=in.next();
		tl.passwordLogic(password);
		
		tl.todoApp();

	}

}
