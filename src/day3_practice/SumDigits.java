package day3_practice;

import java.util.Scanner;

public class SumDigits {
	//Data Members
	int digits,sum;
	//Non Return type Method
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input"); //Ask user to enter the input
		int number=in.nextInt();
		while(number>0) {  //to check if the user input is greater than 0
			digits=number%10;
			sum=sum+digits;
			number=number/10;
		}
		System.out.println("Sum is "+sum); //sum of digits of a number given by user
		
	}

}
