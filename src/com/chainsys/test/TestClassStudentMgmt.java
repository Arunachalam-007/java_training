package com.chainsys.test;

import com.chainsys.mgmt.StudentMgmtSystem;

public class TestClassStudentMgmt {

	public static void main(String[] args) {

		StudentMgmtSystem sm = new StudentMgmtSystem();
		sm.gender = 'm';
		System.out.println(sm.rollNo);
		System.out.println(sm.gender);
		System.out.println(sm.emailid);
		

		StudentMgmtSystem sm1 = new StudentMgmtSystem();
		sm1.gender = 'f';
		
		
		System.out.println(sm1.gender);

	}
}
