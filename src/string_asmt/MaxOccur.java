package string_asmt;

import java.util.Scanner;

public class MaxOccur {
	public static void main(String[] args) {

//	    String str= "Arunachalam";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String str=in.nextLine();

	    if(highestOccuredChar(str) != ' ') {
	    	
	    System.out.println(Character.toString(highestOccuredChar(str)));
	    }
	    else
	        System.out.println("The String doesn't have any character whose occurance is more than 1");
	}

	static char highestOccuredChar(String str) {

	    int [] count = new int [200];

	    for ( int i=0 ;i<str.length() ; i++){
	        count[str.charAt(i)]++;
	    }

	    int max = -1 ;
	    char result = ' ' ;
	    for(int j =0 ;j<str.length() ; j++){
	        if(max < count[str.charAt(j)] && count[str.charAt(j)] > 1) {
	            max = count[str.charAt(j)];
	            result = str.charAt(j);
	        }
	    }

	    return result;

	}
}
