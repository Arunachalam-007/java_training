package overloading_asmt;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Bank b=new Bank(1000,1500,2000);
		System.out.println("Amount is :"+b);
		
		System.out.println("Balance in Bank3 is :$"+b.getBalance());
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Withdraw Amount should be less than $1500");
		int wd=in.nextInt();
		
		System.out.println("Balance in Bank 2 is :$"+b.getBalance(wd));

	}

}
