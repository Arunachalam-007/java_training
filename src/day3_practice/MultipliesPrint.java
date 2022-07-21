package day3_practice;

public class MultipliesPrint {
	//Non Return type method
	public void print() {
		for(int i=1;i<=100;i++) {
			
			//if i is multiples of both three and five print “FizzBuzz”.
			if((i%3==0)&&(i%5==0)) {
				System.out.println("FizzBuzz");
			}
			//if i is multiplies of 3 print Fizz
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			//if i is multiplies of 5 print Buzz
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			
		}
	}

}
