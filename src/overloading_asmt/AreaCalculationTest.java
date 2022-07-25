package overloading_asmt;

import java.util.Scanner;

public class AreaCalculationTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		int length=in.nextInt();
		System.out.println("Enter Width of Rectangle");
		int width=in.nextInt();
		
		//Area calculation for Rectangle
		AreaCalculation ac=new AreaCalculation();
		ac.areaCalc(length,width);

		//Area calculation for Sqaure
		
		System.out.println("Enter one side value of Sqaure");
		int a=in.nextInt();
		
		ac.areaCalc(a);
	}

}
