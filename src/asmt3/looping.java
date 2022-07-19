package asmt3;

import java.util.Scanner;

public class looping {
	public void forLoopConcept() {
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
	}
	public static void whileLoopConcept() {
		int j = 1;
		while(j<=5) {
			System.out.println("j value is :"+j);
			j++;
		}
	}
	public static void doWhileConcept() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1 and number2");
		int number1=s.nextInt();
		int number2=s.nextInt();
		
		do {
			int k=number1+number2;
			System.out.println("K value is :"+k);
		}while(number2<number1);
	}
}
