package day3_practice;

import java.util.Scanner;

public class Login {
	
	String mailId="arun@gmail.com";
	String passWord="12345678";
	String mail,pwd;

	public void checking() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter mailid");
		mail=in.next();
		System.out.println("Enter Password");
		pwd=in.next();
		if((mail.equals(mailId))&&(pwd.equals(passWord))) {
			System.out.println("you can login now");
		}
		else {
			System.out.println("Invalid");
		}
		
		
	}
}
