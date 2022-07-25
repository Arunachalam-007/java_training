package com.chainsys.constructor;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.GradeCalc(70, 80, 96);
		
		System.out.println(mo.GradeCalc("Arunachalam",20));
		System.out.println(mo.GradeCalc(true, 90));
		System.out.println(mo.GradeCalc(false));
		

	}

}
