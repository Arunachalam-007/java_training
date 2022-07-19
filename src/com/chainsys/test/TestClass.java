package com.chainsys.test;

import com.chainsys.HelloWorld;

public class TestClass {

	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		String a = h.firstName = "Kumar";
		
		System.out.println(a);
	}

}
