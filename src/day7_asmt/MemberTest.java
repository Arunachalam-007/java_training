package day7_asmt;

public class MemberTest {

	public static void main(String[] args) {
		Employee e=new Employee("Arun", 21, 72672877898l, "Kovilpatti", 30000);
		Manager m=new Manager("Momo", 20, 327782987l, "Tenkasi", 90000);
		Employee e1=new Employee("Trainee Programmer");
		System.out.println(e1.specialization);
		
		System.out.println("Name:"+e.name+" Age :"+e.age+" Phone Number :"+e.phoneNumber+" Address :"+e.address+" Salary :"+e.salary);
		e.printSalary();
		
		System.out.println();
		System.out.println("**********************************");
		System.out.println();
		Manager m1=new Manager("Production");
		System.out.println(m1.department);
		System.out.println("Name :"+m.name+" Age :"+m.age+" Phone Number :"+m.phoneNumber+" Address :"+m.address+" Salary :"+m.salary);
		

	}

}
