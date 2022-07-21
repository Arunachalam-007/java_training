package day4_asmt;

import java.util.Scanner;

public class Fascinating {
	public void calc() {
		int number,val1,val2,count;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		number=in.nextInt();
		val1=number*2;
		val2=number*3;
		String res=number+" "+val1+val2;
		int flag=1;
		for(char i='1';i<='9';i++) {
			count=0;
			for(int j=0;j<res.length();j++) {
				char ch=res.charAt(j);
				
				if(ch==i) {
					count++;
				}
			}
				
				if(count>1||count==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println("The "+number+" is Fascinating Number");
			}
			else {
				System.out.println("The given Number is not a Fascinating Number");
			}
			
			
		}
		
		
	}


