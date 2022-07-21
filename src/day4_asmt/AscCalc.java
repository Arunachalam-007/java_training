package day4_asmt;

import java.util.Scanner;

public class AscCalc {
	int limit,initial=0,count=1;
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Limit");
		limit=in.nextInt();
		int arr[]=new int[limit];
		for(int i=0;i<limit;i++) {
			System.out.println("Enter Elements");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<limit-1;i++) {
			if(arr[i]<arr[i+1]) {
				count+=1;
				System.out.print(arr[i]+" "+arr[i+1]);
				System.out.println();	
			}
		}
		System.out.println(count);
	}
}
