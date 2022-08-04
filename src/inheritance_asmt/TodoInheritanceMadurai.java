package inheritance_asmt;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoInheritanceMadurai {

	
	public int id=2999;
	public String location="madurai";
	
	public void process(int id,String location) {
		if((id==2999)&&(location.equals("madurai"))) {
			Scanner in=new Scanner(System.in);
			System.out.println("id :"+id+" "+" location :"+location);
			System.out.println("Enter No of Tasks");
	        int n = in.nextInt();
	        
	        ArrayList al=new ArrayList(n);
	        for(int j=0;j<n;j++)
	        {
	            System.out.println("Enter the Task");
	            String s=in.next();
	            al.add(j, s);
	        }
	        System.out.println("ToDo are :");
	        
	        for (Object object : al) {
				System.out.println(object);
			}
			
		}
		else {
			System.out.println("Id is not valid");
			System.out.println("****************************");
			System.out.println();
		}
	}
	
}
