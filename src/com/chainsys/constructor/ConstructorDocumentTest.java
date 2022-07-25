package com.chainsys.constructor;

public class ConstructorDocumentTest {

	public static void main(String[] args) {
		
		//Default Constructor
		
		//Constructor with value 
		ConstructorDocument cd=new ConstructorDocument();
		System.out.println(cd.name);
		System.out.println(cd.eid);
		System.out.println(cd.salary);
		
		//Constructor with two value passing
		ConstructorDocument cd1=new ConstructorDocument("Arunachalam",1111);
		System.out.println(cd1);
		
		//Constructor with three value passing
		ConstructorDocument cd2=new ConstructorDocument("Arunachalam Kaliraj",2222,2000);
		System.out.println(cd2);
		
		
	}

}
