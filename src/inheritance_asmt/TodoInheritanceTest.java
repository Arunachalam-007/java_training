package inheritance_asmt;

import java.util.Scanner;

import abstract_asmt.TodoLogic;

public class TodoInheritanceTest {

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
		System.out.println("Successfully Signed in");
		System.out.println();
		TodoInheritanceChennai tic=new TodoInheritanceChennai();
		TodoInheritanceMadurai tim=new TodoInheritanceMadurai();
		
		tic.assignTask(7,true);
		
		tim.process(3000,"Kovilpatti");
		
		TodoInheritanceHR tih=new TodoInheritanceHR();
		TodoInheritanceManager tim2=new TodoInheritanceManager();
		
		tih.process();
		tim2.assignTask();
}
}
