package day7_asmt;

public class Employee extends Member {

	public Employee(String name, int age, long phoneNumber, String address, int salary) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;	
	}


	public String specialization;
	
	public Employee(String specialization) {
		this.specialization=specialization;
	}
	
		
	
	
	

}
