package string_asmt;

import java.util.Scanner;

public class Replace {
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String str1=in.nextLine();
		System.out.println(str1);
		System.out.println("which word u want to change");
		String str3=in.nextLine();
		System.out.println("Enter substring");
		String str2=in.nextLine();
		
		String res=str1.replace(str3, str2);
		System.out.println(res);
	}

}
