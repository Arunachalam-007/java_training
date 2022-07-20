package day3_practice;

import java.util.Scanner;

public class EvenDigits {
	int lastDigit;
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value");
		int value=in.nextInt();
		while(value!=0) {
			lastDigit=value%10;
			if(lastDigit%2==0) {
				System.out.println("Even Digit");
			}
			
		}
		value=value/10;
		
		
	}

}
