package com.chainsys.arithmetic;

import java.util.Scanner;

public class ConditionStmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter mark1");
		int mark1=sc.nextInt();
		if((mark1>0)&&(mark1<=100)) {
			System.out.println("Enter mark2");
			int mark2=sc.nextInt();
			if(mark2>0) {
				if(mark2<=100) {
					System.out.println("Enter mark3");
					int mark3=sc.nextInt();
					if(mark3>0) {
						if(mark3<=100) {
							System.out.println(mark3>mark1);
							System.out.println("Name : "+ name);
							System.out.println("Mark1 is :"+ mark1 +" Mark2 is :"+ mark2 +" Mark3 is :"+ mark3);
							int avg=(mark1 + mark2 + mark3)/3;
							System.out.println("Average is :" +avg);
							if(avg>=90) {
								System.out.println("Grade='O'");
							}else if(avg>=80) {
								System.out.println("Grade='A'");	
							}else if(avg>=70) {
								System.out.println("Grade='B+'");	
							}else if(avg>=60) {
								System.out.println("Grade='B'");	
							}else {
								System.out.println("PASS");
							}
						}else {
							System.out.println("Mark3 can't be more than 100");
						}
					}else {
						System.out.println("Mark3 can't be negative");
					}
					
				}else {
					System.out.println("Mark2 can't be more than 100");
				}
			}else {
				System.out.println("Mark2 can't be negative");
			}
		}
		else {
			System.out.println("Enter valid mark");
		}
	}

}
