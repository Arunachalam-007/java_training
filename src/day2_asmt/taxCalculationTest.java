package day2_asmt;

import java.util.Scanner;

public class taxCalculationTest {

	public static void main(String[] args) {
		taxCalculation t=new taxCalculation();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Gross Salary");
		int grossSalary=s.nextInt();
		System.out.println("Enter Your Saving Amount");
		int totalSavings=s.nextInt();
		
		t.taxCalculator(grossSalary,totalSavings);
	}

}
