package overloading_asmt;

import java.util.Scanner;

public class Validator {

	GettersSetters gs = new GettersSetters();

	//Name validation
	public String nameValidation(String name) {

		if ((name.trim().length() >= 4) && (!name.isEmpty())) {
			System.out.println("Name is valid");
			return name;
			
		} else {
			System.out.println("invalid name");
		}
		return "Plz enter valid name";
	}

	//Roll number validation
	public int rollNoValidation(int rollNo) {
		
		if ((rollNo > 4) && (rollNo != 0)) {
			System.out.println("rollNo is valid");
			return rollNo;
		}
		else {
			System.out.println("invalid rollNo");		
		}
		return 0;
	}

	//Grade validation
	public String gradeValidation(String grade) {
		
		if ((grade.trim().length() > 1) && (!grade.isEmpty())) {
			System.out.println("Grade is valid");
			return grade;
		}
		else {
			System.out.println("invalid grade");
		}
		
		return "Plz enter valid grade"; 
	}

}
