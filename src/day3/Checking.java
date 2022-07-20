package day3;

public class Checking {
	int a=5,b=10,c,d=5,e;

	public void add() {
		c=a+b;
		System.out.println("c value :"+c);	
	}
	public void sub() {
		e=c-d;
		System.out.println("e value :"+e);
		
	}
	public static void main(String[] args) {
		Checking c1=new Checking();
		c1.add();
		c1.sub();
		
	}

}
