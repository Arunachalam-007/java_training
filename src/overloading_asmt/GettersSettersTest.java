package overloading_asmt;

import java.util.Scanner;

public class GettersSettersTest {

	public static void main(String[] args) {

		GettersSetters gs = new GettersSetters();
		Validator v = new Validator();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = in.next();
		String nameValidation = v.nameValidation(name);
		gs.setName(nameValidation);
		System.out.println(gs.getName());
//		System.out.println(nameValidation);
		
		
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter rollNo");
		int rollNo = in1.nextInt();
		int rollNoValidation=v.rollNoValidation(rollNo);
		gs.setRollNo(rollNoValidation);
		System.out.println(gs.getRollNo());
//		System.out.println(rollNoValidation);
		
		
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter Grade");
		String grade = in2.next();
		String gradeValidation=v.gradeValidation(grade);
		gs.setGrade(gradeValidation);
		System.out.println(gs.getGrade());
//		System.out.println(gradeValidation);
		
		


	}

}
