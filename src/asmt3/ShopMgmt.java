package asmt3;

import java.util.Scanner;

public class ShopMgmt {
	
	String custName;
	int price;
	
	
	public void productDetails(String productName) {
		System.out.println(productName);
		
	}
	public String customerDetails() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Name");
		custName=s1.next();
		return custName;
		
	}
	public int productAmount(int price) {
		return price;
	}

	public void paymentOption() {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter 1 for Gpay 2 for Phonepe 3 for Cash");
		int option=s2.nextInt();
		switch(option) {
		case 1:
			System.out.println("Gpay");
			break;
		case 2:
			System.out.println("Phonepe");
			break;
		default:
			System.out.println("Cash");
			break;
		}
				
		
	}
	

}