package overloading_asmt;

public class CharOverloading {

	
	//Non return type method overloading integer and character
	public void calc(int n,char c) {
		System.out.println("N value is :"+n);
		System.out.println("C value is :"+c);
		
	}
	
	//Non return type method overloading character and integer
	public void calc(char c,int n) {
		System.out.println("Char value is :"+c);
		System.out.println("integer value is :"+n);
	}
}
