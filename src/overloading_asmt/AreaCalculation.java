package overloading_asmt;

import java.util.Scanner;

public class AreaCalculation {
	public void areaCalc(int l,int w) {
		int result=l*w;
		System.out.println("Area of Rectangle is :"+result);	
	}
	
	public void areaCalc(int a) {
		int result1=a*a;
		System.out.println("Area of Sqaure is :"+result1);
	}

}
