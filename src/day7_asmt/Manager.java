package day7_asmt;

public class Manager extends Member {
	public Manager(String name, int age, long phoneNumber, String address, int salary) {
//		super(name, age, phoneNumber, address, salary);
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;	
	}

	public String department;
	
	public Manager(String department) {
		this.department=department;
	}
	
	
}
