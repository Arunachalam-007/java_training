package string_asmt;

import java.util.Scanner;

public class Count {
	public void calc() {
		Scanner in=new Scanner(System.in);
		int vowels=0,consonents=0,digits=0,space=0;
		System.out.println("Enter a String");
		String value=in.nextLine();
		value=value.toLowerCase();
		for(int i=0;i<value.length();i++) {
			char ch=value.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels+=1;	
			}
			else if((ch>='a')&&(ch<='z')) {
				consonents+=1;			
			}
			else if((ch>='0')&&(ch<='9')) {
				digits+=1;
			}
			else if(ch==' ') {
				space+=1;
			}
			else {
				System.out.println("Nothing is match");
			}
		}
		System.out.println("Vowels :"+vowels);
		System.out.println("Consonents :"+consonents);
		System.out.println("Digits :"+digits);
		System.out.println("Space :"+space);
	}

}