package day3_practice;

import java.util.Scanner;

public class Rain {
	//Data Members
	String choice;
	
	//Non Return type method
	public void alert() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 'Y' if raining otherwise 'N' ");
		choice=in.next();	
		// If it is raining, tell the user to get an umbrella
		if((choice.equals("Y"))||(choice.equals("y"))) {
			System.out.println("Go with Umbrella");
		}
		System.out.println("Enter Temperature");
		int temperature=in.nextInt();
		if(temperature<32) { // tell the user to bring a heavy jacket (colder than 32 degrees)
			System.out.println("Go with heavy jacket");
		}
		else if(temperature>=32 && temperature<=50) { //tell the users to bring a light jacket (between 32 and 50 degrees)
			System.out.println("Go with  light jacket");
		}
		else{ //no jacket at all
			System.out.println("No need jacket");
		}
	}

}
