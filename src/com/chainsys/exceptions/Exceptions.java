package com.chainsys.exceptions;

public class Exceptions {
	int a=10,b=5,c;
	
	public void calc() {
	try {
		c=a/b;
		System.out.println("The result is :"+c);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("This is displayed if try or catch (anyone) exist");
	}
	
	
	
	}
	
}
