package day3_practice;

import java.util.Scanner;

public class DiamondPattern {
	
	//Data Members
	int i=1,j;
	
	//Print pattern
	public void patternPrint() {
		Scanner sc=new Scanner(System.in);	
		while(i<=3){
			j=1;
			while(j++<=3-i){  //Post Increment
				System.out.print(" ");
				}
			j=1;
			while(j++<=i*2-1){
				System.out.print("*");
				}
			System.out.println();
			i++;
		} 
		i=3-1;
		
		//If i is greater than 0 following will execute
		while(i>0) {
			
				j=1;
				while(j++<=3-i){
					System.out.print(" ");
					}	
				j=1;
				while(j++<=i*2-1){
					System.out.print("*");
					}
				System.out.println();
				i--;
				}
		}

		}
		
		
	

