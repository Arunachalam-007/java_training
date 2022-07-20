package day2_asmt;

import java.util.Scanner;

public class TaxCalculationTest {

	public static void main(String[] args) {
		
		//Create the object for TaxCalculation Class
		TaxCalculation t=new TaxCalculation();
		
		//Get input from users
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Gross Salary");
		int grossSalary=s.nextInt();
		System.out.println("Enter Your Saving Amount");
		int totalSavings=s.nextInt();
		
		t.taxCalculator(grossSalary,totalSavings);
	}

}
