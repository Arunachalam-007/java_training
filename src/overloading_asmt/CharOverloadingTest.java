package overloading_asmt;

public class CharOverloadingTest {

	public static void main(String[] args) {
		CharOverloading co=new CharOverloading();
		
		//Method Overloading int and char
		co.calc(20, 'A');
		
		//Method Overloading Char and int
		co.calc('B', 30);

	}

}
