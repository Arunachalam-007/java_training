package day2_asmt;

import java.util.Scanner;

public class AttendanceMethod {
	public void calculation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total No of Classes Conducted");
		int totalClasses=sc.nextInt();
		System.out.println("No.of Classes Attended");
		int attendedClasses=sc.nextInt();
		System.out.println("If u have medical cause press 'Y'otherwise 'N'");
		String medicalCause=sc.next();
		
		float attendancePercentage=attendedClasses*100/totalClasses;
		if(attendancePercentage>75 || medicalCause.equals("Y")){
			System.out.println("Attendance Percentage % :"+attendancePercentage);
			System.out.println("The Student should be allowed to the exam");
		}
		else {
			System.out.println("Attendance Percentage % :"+attendancePercentage);
			System.out.println("The Student should not allowed to the exam");
		}
	
}
}