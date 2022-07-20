package day3_practice;

import java.util.Scanner;

public class SumDigits {
	int digits,sum;
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input");
		int number=in.nextInt();
		while(number>0) {
			digits=number%10;
			sum=sum+digits;
			number=number/10;
		}
		System.out.println("Sum is "+sum);
		
	}

}
