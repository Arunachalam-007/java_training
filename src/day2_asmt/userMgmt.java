package day2_asmt;

import java.util.Scanner;

public class userMgmt {
	public void calc() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s.nextInt();
		System.out.println("Enter Sex 'M' or 'F' ");
		String gender=s.next();
		System.out.println("Enter marital Status 'Y' or 'N'");
		String maritalStatus=s.next();
		
		if(gender.equals("F")) {
			System.out.println("The employee should work in urban areas");
		}
		else if((gender.equals("M"))&&((age>=20)&&(age<=40))) {
			System.out.println("The employee can work in anywhere");
		}
		else if((gender.equals("M"))&&((age>=40)&&(age<=60))) {
			System.out.println("The employee should work in urban areas");
			
		}
		else {
			System.out.println("ERROR");
		}
		
	}
	

}
