package day4_asmt;

import java.util.Scanner;

public class ArrayProduct {
	
	//Data members
	int n,product=0;
	//Non Return type method
	public void productCalc() {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit");
		n=in.nextInt();
		//Array 
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Elements");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if((arr[i]*arr[i])>product) {
				product=arr[i]*arr[i+1];
			}
		}
		
		System.out.println("Product value is :"+product);
		
		
	}

}
