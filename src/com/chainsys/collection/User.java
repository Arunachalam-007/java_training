package com.chainsys.collection;

public class User {

	String name;
	long mobileNo;
	
	public User(String name,long mobileNo) {
		this.name=name;
		this.mobileNo=mobileNo;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", mobileNo=" + mobileNo + "]";
	}
}
