package stream_asmt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeImpl {

	//print the number of male and female employees
	public int countMale(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		int maleCount = (int) empList.filter(s -> s.gender.startsWith("M")).count();
		System.out.println("Male Employee :" + maleCount);
		return maleCount;
	}

	public int countFemale(ArrayList<Employee> emp2) {
		Stream<Employee> empList = emp2.stream();
		int femaleCount = (int) empList.filter(s -> s.gender.startsWith("F")).count();
		System.out.println("FeMale Employee :" + femaleCount);
		return femaleCount;
	}

	//print the name of the employee who is getting the maximum salary
	public void maxSalary(ArrayList<Employee> emp3) {
		Optional<Employee> maxSalaryEmp = emp3.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Employee with max salary:" + (maxSalaryEmp.isPresent() ? maxSalaryEmp.get().name : "Not Applicable"));
//		System.out.println("Maximum Salary :" + maxSalaryEmp);
	}

	//print the name of the employee who is getting the minimum salary
	public void minSalary(ArrayList<Employee> emp4) {
		Optional<Employee> minSalaryEmp = emp4.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Employee with min salary:" + (minSalaryEmp.isPresent() ? minSalaryEmp.get().name : "Not Applicable"));
//		System.out.println("Minimum Salary :" + minSalaryEmp);
	}
	//print the name of all employee from HR department
	public void findHR(ArrayList<Employee> emp5) {
		Stream<Employee> empList2 = emp5.stream();
		empList2.filter(s -> s.dept == "HR").forEach(s -> System.out.println(s.name));
	}

	// Find the older employee's name, age and salary
	public void findOlderEmp(ArrayList<Employee> emp6) {
		Stream<Employee> empList3 = emp6.stream();
		empList3.filter(s -> s.age > 40).forEach(s -> System.out.println(s.name + " " + s.age + "  " + s.salary));
	}

	//count the no of employees in each department
	public void findDeptCount(ArrayList<Employee> emp7) {
		Stream<Employee> empList5 = emp7.stream();
		int count1 = (int) empList5.filter(s -> s.dept == "HR").count();
		System.out.println(count1);

		Stream<Employee> empList6 = emp7.stream();
		int count2 = (int) empList6.filter(s -> s.dept == "Designing").count();
		System.out.println(count2);

		Stream<Employee> empList7 = emp7.stream();
		int count3 = (int) empList7.filter(s -> s.dept == "Developer").count();
		System.out.println(count3);
	}

	// Calculate the average salary of male and female employees
	public void avgCalc(ArrayList<Employee> emp8) {
		Stream<Employee> empList5 = emp8.stream();
		int value = countMale(emp8);
		int sum = empList5.filter(s -> s.gender == "Male").mapToInt(s -> s.salary).sum();
		int avg = sum / value;
		System.out.println("Avg Sal for Male :" + avg);
	}

	public void avgCalc1(ArrayList<Employee> emp9) {
		Stream<Employee> empList5 = emp9.stream();
		int value = countFemale(emp9);
		int sum = empList5.filter(s -> s.gender == "Female").mapToInt(s -> s.salary).sum();
		int avg = sum / value;
		System.out.println("Avg Sal for Female :" + avg);
	}

	// print the average salary and total salary
	public void avgCalc3(ArrayList<Employee> emp10) {
		Stream<Employee> empList5 = emp10.stream();
		int value = countFemale(emp10) + countMale(emp10);
		int sum = empList5.mapToInt(s -> s.salary).sum();
		int avg = sum / value;
		System.out.println("Total is :" + sum);
		System.out.println("Avg is :" + avg);
	}

	//create a map with this list where empid is key
	public void mapFunc(ArrayList<Employee> emp11) {
		Stream<Employee> empList5 = emp11.stream();

		Map<Object, Employee> mapValue = empList5.collect(Collectors.toMap(s -> s.eid, Function.identity()));

		System.out.println(mapValue);
	}

}
