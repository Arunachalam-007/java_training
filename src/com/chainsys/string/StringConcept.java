package com.chainsys.string;

public class StringConcept {
	public void stringCalc() {
		char c[]= {'a','r','u','n'};
		String s=new String(c);
		
		System.out.println("s value is :"+s);
		
		String s1="Arunachalam";
		System.out.println("s1 value is :"+s1);
		
		
		String s2=new String("Arunachalam K");
		System.out.println("s2 value is :"+s2);
		
		//charAt Method Returns the char value at thespecified index.
		System.out.println(s1.charAt(2));
		
		//concat method Concatenates the specified string to the end of this string.
		System.out.println(s1.concat("Kaliraj"));
		
		//contains method Returns true if and only if this string contains the specifiedsequence of char values.
		
		System.out.println(s1.contains("run"));
		
		//endsWith method Tests if this string ends with the specified suffix.
		System.out.println(s1.endsWith("am"));
		
		//indexOf method Returns the index within this string of the first occurrence of thespecified substring. 
		
		System.out.println(s1.indexOf("acht"));
		
		//isEmpty method Returns true if, and only if, length() is 0.
		System.out.println(s1.isEmpty());
		
		
		//length method Returns the length of this string. 
		System.out.println(s1.length());
		
		//replace method Replaces each substring of this string that matches the literal targetsequence with the specified literal replacement sequence.
		System.out.println(s1.replace("a", "v"));
		
		//substring method begin index only mentioned Returns a string that is a substring of this string. Thesubstring begins with the character at the specified index andextends to the end of this string. 
		System.out.println(s1.substring(3));
		
		//substring method Returns a string that is a substring of this string. The substring begins at 
		//the specified beginIndex and extends to the character at index endIndex - 1.length=end index-begin index
		System.out.println(s1.substring(3, 6));
		
		//lowercase method Converts all of the characters in this String to lowercase
		System.out.println(s1.toLowerCase());
		
		//upper case method Converts all of the characters in this String to uppercase
		System.out.println(s1.toUpperCase());
		
	}

}
