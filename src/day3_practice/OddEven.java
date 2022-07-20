package day3_practice;

import java.util.Scanner;

public class OddEven {
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=in.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
			
		}
		System.out.println("Cube value is :"+n*n*n);
		
	}

}
