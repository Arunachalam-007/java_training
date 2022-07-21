package day3_practice;

import java.util.Scanner;

public class ReversePyramid {
	//Non Return type Method
	public void pyramidPattern() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");     //Get input from user    
        int rows = sc.nextInt();         
        for (int i = rows; i>=1; i--) {
            for (int j = 1; j <= i; j++){
                if(j%2 == 0){ //to check if the j value is even
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }       
            System.out.println();
        }
	}
			
	}

