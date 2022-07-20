package day3;

import java.util.Scanner;

public class CabBooking {
	int option,price,km;
	double hour;
	String usrName,mailId;
	
	//Getting Details from users
	public void userInfo() {
		Scanner in1=new Scanner(System.in);
		System.out.println("Enter Your Name");
		usrName=in1.next();
		System.out.println("Enter Your MailId");
		mailId=in1.next();	
	}
	
	//Calculate the amount
	public void calc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter option 1 for 'Honda Amaze' 2 for 'Maruti Suzuki Dzire'");
		option=in.nextInt();
		
		//use switch to choose the cab
		switch(option) {
		case 1:
			System.out.println("Enter KM");
			km=in.nextInt();
			System.out.println("Enter Hour");
			hour=in.nextDouble();
			
			//The KM and HOUR should be positive values
			if(km>0 || hour>0) {
				
				//If the km is greater than or equal to 50 and hour is less than or equal to 5 advance is 2000 and per km 5rs
				if(km<=50 && hour<=5.0) {
					price=2000+(km*5);
					System.out.println("Price :"+price);
				}
				//if the km between 50 to 100 and hour<=10 advance is 4000 and per km 3rs
				else if(((km>50)&&(km<=100))&&(hour<=10.0)) {
					price=4000+(km*3);
					System.out.println("Price "+price);
				}
				//if the km is above 100km price is 10000
				else {
					price=10000;
					System.out.println("Price "+price);
				}
			}
			else {
				System.out.println("KM and Hour Can't be negative values");
			}
			
			break;
		case 2:
			System.out.println("Enter KM");
			km=in.nextInt();
			System.out.println("Enter Hour");
			hour=in.nextDouble();
			
			//The KM and HOUR should be positive values			
			if(km>0 || hour>0) {
				//If the km is greater than or equal to 50 and hour is less than or equal to 4 advance is 2500 and per km 7rs
				if(km<=50 && hour<=4.0) {
					price=2500+(km*7);
					System.out.println("Price :"+price);
				}
				//if the km between 50 to 100 and hour<=8 advance is 4500 and per km 8rs
				else if(((km>50)&&(km<=100))&&(hour<=8.0)) {
					price=4500+(km*5);
					System.out.println("Price "+price);
				}
				//if the km is above 100km price is 15000
				else {
					price=15000;
					System.out.println("Price "+price);
				}	
			}
			
			break;
		default:
			System.out.println("Invalid");
					
		}	
		
	}
	
	//Display the Car details
	public void carDetails() {
		System.out.println("Honda Amaze");
		System.out.println("Upto 50KM Advance is 2000 and per each km 5RS");
		System.out.println("Between 50 to 100KM Advance is 4000 and per each KM 3RS");
		System.out.println("More than 100KM 10000RS");
		System.out.println("************************************************************");
		System.out.println("Maruti Suzuki Dzire");
		System.out.println("Upto 50KM Advance is 2500 and per each km 7RS");
		System.out.println("Between 50 to 100KM Advance is 4500 and per each KM 5RS");
		System.out.println("More than 100KM 15000RS");
		System.out.println();
	}
	//Display user Info
	public void displayInfo() {
		System.out.println("User Name is :"+usrName);
		System.out.println("Email is :"+mailId);
	}

}
