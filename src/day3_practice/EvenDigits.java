package day3_practice;

import java.util.Scanner;

public class EvenDigits {
	//Variables Declaration and Assigning Values
	int lastDigit=0,value1;
	
	//Calculation process
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value");
		int value=in.nextInt();
		
		//To check the given number is not equal
		while(value!=0) {
			value1=value;
			value1=value%10; 
			if(lastDigit%2==0) {
				System.out.println(value1);  //even digits in the given number
			}
			lastDigit+=1;
			value=value/10;
			
		}
		
	
		System.out.println();	
	}

}
