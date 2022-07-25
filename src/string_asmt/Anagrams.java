package string_asmt;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	static boolean calc(String str3,String str4) {
		
		int n1=str3.length();
		int n2=str4.length();
		
		char arrayOfCharacters[] = str3.toCharArray();
		Arrays.sort(arrayOfCharacters);
		char arrayOfCharacters1[]=str4.toCharArray();
		Arrays.sort(arrayOfCharacters1);
		
		if(n1!=n2) {
			return false;
		}
		else {
			for(int i=0;i<n1;i++) {
				if(arrayOfCharacters[i]!=arrayOfCharacters1[i]) {
					return false;
				}
			
			}	
		}
		
		return true;	
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=in.nextLine();
		System.out.println("Enter Second String");
		String str2=in.nextLine();
		
		if(calc(str1,str2)) {
			System.out.println("The two strings are anagram of each other");	
		}
		else {
			System.out.println("The two strings are not anagram of each other");
		}
		
	}
		
}
