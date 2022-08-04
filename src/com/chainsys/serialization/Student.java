package com.chainsys.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	
	int rollNo;
	String location;
	public Student(String name,int rollNo,String location) {
		this.name=name;
		this.rollNo=rollNo;
		this.location=location;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", location=" + location + "]";
	}
	

}
