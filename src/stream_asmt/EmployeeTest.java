package stream_asmt;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
//		EmployeeImpl e=new EmployeeImpl();
//		e.usingStream();

		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		Employee e=new Employee("A1","Arun","Male", 80000, 20, "Developer");
		Employee e1=new Employee("R2","Rekha","Female", 70000, 22, "HR");	
		Employee e2=new Employee("G3","Gowri","Female", 32000, 55, "HR");
		Employee e3=new Employee("M4","Melfin","Male", 13000, 50, "Designing");
		Employee e4=new Employee("K5","Kohile","Female", 42000, 45, "Developer");
		Employee e5=new Employee("B6","Bala","Male", 70000, 41, "HR");
		Employee e6=new Employee("G7","Gowsi","Female", 10000, 47, "Designing");
		
		
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		EmployeeImpl ei=new EmployeeImpl();
		ei.countMale(emp);
		ei.countFemale(emp);
		
		ei.maxSalary(emp);
		ei.minSalary(emp);
		
		ei.findHR(emp);
		
		ei.findOlderEmp(emp);
		
		ei.findDeptCount(emp);
		
		ei.avgCalc(emp);
		
		
		
		ei.avgCalc1(emp);
		
		ei.avgCalc3(emp);
		
		ei.mapFunc(emp);
	}

}
