package overloading_asmt;

import java.util.Scanner;

public class StdudentOverloadingTest {

	public static void main(String[] args) {
		StudentOverloading so=new StudentOverloading();
		System.out.println(so);
		so.setInfo("Arunachalam", 21);
		
		int age[]= {21,22,21,19,20,19,17,18,20,19};
		String name[]= {"Arun","Momo","Ashiq","Guhan","Melfin","Mano","Bala","Balachandar","Hari","Ajith"};
		String address[]= {"aaa","bbb","ccc","ddd","eeee","ffff","gggg","hhh","iii","jjj"};
		for(int i=0;i<10;i++) {
			so.setInfo(name[i], age[i], address[i]);			
		}
		
	}

}
