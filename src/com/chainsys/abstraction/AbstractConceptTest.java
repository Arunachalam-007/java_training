package com.chainsys.abstraction;

public class AbstractConceptTest {

	public static void main(String[] args) {
		AbstractConceptChild acc=new AbstractConceptChild();
		acc.addition();
		acc.division(20, 5);
		System.out.println("subtraction :"+acc.sub(30,17));
		acc.multiplication(10, 7);
	
	}

}
