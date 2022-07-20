package day3_practice;

import java.util.Scanner;

public class MultiplicationTable {
	public void table() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value");
		int value=in.nextInt();
		for(int i=0;i<=15;i++) {
			System.out.println(i+"*"+value+"="+i*value);
			
		}
	}
}
