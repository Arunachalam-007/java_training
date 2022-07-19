package asmt1;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int quantity=sc.nextInt();
		int amount=quantity*100;
		if(quantity>10) {
			int totalCost=(amount*(100-10))/100;
			System.out.println("Total cost is :"+totalCost);
		}
		else {
			System.out.println("Amount is :"+amount);
		}		
	}

}
