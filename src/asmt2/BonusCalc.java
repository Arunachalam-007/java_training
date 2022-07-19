package asmt2;

import java.util.Scanner;

public class BonusCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary=sc.nextInt();
		System.out.println("Enter Year of service");
		int experience=sc.nextInt();
		if(experience>5) {
			switch(experience) {	
			default:
				double bonus=salary*0.05;
				System.out.println(bonus);
			
		}
		}	
		
	}

}
