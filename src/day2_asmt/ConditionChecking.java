package day2_asmt;

public class ConditionChecking {
	int x=2,y=5,z=0;
	public void checking() {
		
		//To check the condition to return the boolean values
		System.out.println(x==2);
		System.out.println(x != 5);
		System.out.println(x != 5 && y >= 5);
		System.out.println( z != 0 || x == 2);
		System.out.println(!(y < 10));
	}

}
