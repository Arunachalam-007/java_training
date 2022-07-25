package string_asmt;

import java.util.Scanner;

public class ReverseIndividual {

	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
	     System.out.println("Enter a input String :");
	     String str = ip.nextLine();
	     String strArr[] = str.split(",");
	     int arrLen = strArr.length;
	     for(int i=0;i<arrLen;i++)
	        {
	            int subLen = strArr[i].length();
	            for(int j=0;j<subLen;subLen--)
	            {
	                System.out.print(strArr[i].charAt(subLen-1));
	            }
	            System.out.print(" ");
	        }

		
	}

}
