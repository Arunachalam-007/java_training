package day3;

import java.util.Scanner;

public class Continue {
	int limit;
	//implement the Continue using non return type method
	public void continueProcess() {
		
		//Getting limit from user
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit");
		limit=in.nextInt();
		//implementation for continue
		 for (int i = 0; i < limit; i++) {
	            if (i == 5)
	                continue;
	            System.out.println("i value is "+i);
	        }
	}

}
