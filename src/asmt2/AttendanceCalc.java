package asmt2;

import java.util.Scanner;

public class AttendanceCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total No of Classes Conducted");
		int totalClasses=sc.nextInt();
		System.out.println("No.of Classes Attended");
		int attendedClasses=sc.nextInt();
		float attendancePercentage=attendedClasses*100/totalClasses;
		System.out.println("Attendance Percentage % :"+attendancePercentage);
		String res=(attendancePercentage>75)?"The Students should be allowed to the Exam":"The students shouldn't allowed to the Exam";
		System.out.println(res);
		
	}
	

}
