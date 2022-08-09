package stream_asmt;

import java.util.Scanner;
import java.util.stream.Stream;

public class Employee {
	
	String eid;
	String name;
	int salary;
	int age;
	String dept;
	String gender;
	public Employee(String eid,String name,String gender,int salary,int age,String dept) {
		this.eid=eid;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
		this.age=age;
		this.dept=dept;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept
				+ ", gender=" + gender + "]";
	}
	
	
	
}
