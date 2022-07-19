package asmt2;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int quantity=sc.nextInt();
		int amount=quantity*100;
		int res=(quantity>10)?1:0;
		switch(res) {
		case 1:
			int totalCost=(amount*(100-10))/100;
			System.out.println("Total cost is :"+totalCost);
			break;
		case 0:
			System.out.println("The Amount is :"+amount);
			break;

		default:
			System.out.println("Invalid");
			
		}
	}

}
