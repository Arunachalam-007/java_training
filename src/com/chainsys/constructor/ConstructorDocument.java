package com.chainsys.constructor;

public class ConstructorDocument {
	String name;
	int eid;
	double salary;
	public ConstructorDocument() {
		name="arun";
		eid=2999;
		salary=1000;
		
	}
	
	public ConstructorDocument(String name,int eid) {
		this.name=name;
		this.eid=eid;
		
	}
	
	public ConstructorDocument(String name,int eid,double salary) {
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "ConstructorDocument [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
	}

}
