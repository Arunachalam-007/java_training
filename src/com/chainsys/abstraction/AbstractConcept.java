package com.chainsys.abstraction;

public abstract class AbstractConcept {
	public void addition() {
		System.out.println("addition :"+3+5);
	}
	
	public int sub(int a,int b) {
		
		return a-b;
	}
	
	public void multiplication(int c,int d) {
		int s=c*d;
		System.out.println("multiplication "+s);
	}
	public abstract void division(int e,int f);

}
