package com.chainsys.constructor;

public class MethodOverloading {
	
	public int mark1;
	public int mark2;
	public int mark3;
	public int age;
	public String name;
	public int avg;
	
	public void GradeCalc(int mark1,int mark2,int mark3) {
		int total=mark1+mark2+mark3;
		avg=total/3;
		System.out.println("Avg is :"+avg);	
	}
	
	public String GradeCalc(String name,int age) {
		System.out.println("Age is :"+age);
		System.out.println("Name is");
		return name;	
	}
	public int GradeCalc(boolean shortage,int avg ) {
		if(shortage) {
			avg-=10;	
			
		}
		return avg;	
	}
	public boolean GradeCalc(boolean disabledStudent) {
		if(disabledStudent) {
			System.out.println("Disable Student");
		}
		else {
			System.out.println("Not a Disable student ");
		}
		return disabledStudent;
	}

}
