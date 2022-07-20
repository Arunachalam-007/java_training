package day3_practice;

import java.util.Scanner;

public class Rain {
	String choice;
	public void alert() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 'Y' if raining otherwise 'N' ");
		choice=in.next();		
		if((choice.equals("Y"))||(choice.equals("y"))) {
			System.out.println("Go with Umbrella");
		}
		System.out.println("Enter Temperature");
		int temperature=in.nextInt();
		if(temperature<32) {
			System.out.println("Go with heavy jacket");
		}
		else if(temperature>=32 && temperature<=50) {
			System.out.println("Go with  light jacket");
		}
		else{
			System.out.println("No need jacket");
		}
	}

}
