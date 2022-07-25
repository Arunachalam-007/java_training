package string_asmt;

import java.util.Scanner;

public class Abbreviations {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=in.nextLine();
		
		 String[] myName = name.split(" ");
		    for (int i = 0; i < myName.length; i++) {
		        String s = myName[i];    		        	
		        }
		    System.out.println(myName[0].charAt(0)+"."+myName[1].charAt(0)+"."+myName[2]);
		        
		    }
	}


