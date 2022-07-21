package day3_practice;

import java.util.Scanner;

public class AvgProduct {
	
	//Data members
    int sum = 0,count=0,product=1;
    char msg = 'a';
    
    //Calculation process
    public void calc() {
        Scanner s = new Scanner(System.in);
        
        while(msg != 'q') {  //if the user input is q then it will quit
            System.out.println("Enter a number :");
            int number = s.nextInt();
            
            //product calculation
            sum += number; 
            count += 1; 
            product *= number; 
            
            System.out.println("if you want to quite enter 'q'");
            msg = s.next().charAt(0);
            }
            System.out.println("Product :" + product);
        }
    
    //Average Calculation
    public void avgCalc() {
        int average = sum/count;
        System.out.println("Average :" +average);
        
    }

}
