package day2_asmt;

import java.util.Scanner;

public class Attendance {
	public void calculation() {
		
		//getting input from users
		Scanner sc=new Scanner(System.in);
		System.out.println("Total No of Classes Conducted");
		int totalClasses=sc.nextInt();
		System.out.println("No.of Classes Attended");
		int attendedClasses=sc.nextInt();
		System.out.println("If u have medical cause press 'Y'otherwise 'N'");
		String medicalCause=sc.next();
		
		//To calculate the Attendance Percentage
		
		float attendancePercentage=attendedClasses*100/totalClasses;
		
		//To check the condition whether the student have 75% attendance or not
		if(attendancePercentage>75 || medicalCause.equals("Y")){
			System.out.println("Attendance Percentage % :"+attendancePercentage);
			System.out.println("The Student should be allowed to the exam");
		}
		//if the condition is fails it goes to else block
		else {
			System.out.println("Attendance Percentage % :"+attendancePercentage);
			System.out.println("The Student should not allowed to the exam");
		}
	
}
}