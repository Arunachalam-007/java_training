package day2_asmt;

import java.util.Scanner;

public class UserMgmt {
	public void calc() {
		Scanner s=new Scanner(System.in);
		
		//Get input from users
		System.out.println("Enter Age");
		int age=s.nextInt();
		System.out.println("Enter Sex 'M' or 'F' ");
		String gender=s.next();
		System.out.println("Enter marital Status 'Y' or 'N'");
		String maritalStatus=s.next();
		
		//input.hasNextInt() to check the input (non negative)
		//if employee is female, then she will work only in urban areas.
		if(gender.equals("F")) {
			System.out.println("The employee should work in urban areas");
		}
		//if employee is a male and age is in between 20 to 40 then he may work in anywhere
		else if((gender.equals("M"))&&((age>=20)&&(age<=40))) {
			System.out.println("The employee can work in anywhere");
		}
		//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
		else if((gender.equals("M"))&&((age>=40)&&(age<=60))) {
			System.out.println("The employee should work in urban areas");
			
		}
		//And any other input of age should print "ERROR".
		else {
			System.out.println("ERROR");
		}
		
	}
	

}
