package day3_practice;

import java.util.Scanner;

public class OddEven {
	//Non Return Method
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=in.nextInt();
		for(int i=0;i<=n;i++) {
			//If the given number is even then print Even Number
			if(i%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number"); ////If the given number is odd then print Odd Number
			}
			
		}
		System.out.println("Cube value is :"+n*n*n);
		
	}

}
