package day3_practice;

import java.util.Scanner;

public class AvgProduct {
	int avg,res,res1;
	public void calc() {
		
		String option="n";
		Scanner in=new Scanner(System.in);
		
		
		while(!option.equals("q")) {
			System.out.println("Enter integer value");
			int value=in.nextInt();
			System.out.println("Enter q to quit");
			option=in.next();
			res1=value*res1;
			System.out.println("Product"+res1);
		}
		System.out.println("Outside");
		
	}

}
