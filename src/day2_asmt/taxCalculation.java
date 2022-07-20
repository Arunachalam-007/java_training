package day2_asmt;


public class TaxCalculation {
	
	//Initialize the Class Variable
	int tax,tax1,tax2,tax3;
		
		//Create the method named taxCalculator
		public void taxCalculator(int grossSalary,int totalSavings) {
			
			//The savings is deducted from the gross income to calculate the taxable income.
			int taxableIncome=grossSalary-totalSavings;
			
			//For up to 100,000 as taxable income the tax is 0
			if(taxableIncome<=100000) {
				tax=0;
				System.out.println(tax);
			}
			
			//beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 
			else if((taxableIncome>100000)&&(taxableIncome<=200000)) {
				tax1=(taxableIncome*(100-10))/100;
				System.out.println(tax1);
			}
			//beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and 
			//then 20% of the taxable income exceeding 200,000
			else if((taxableIncome>200000)&&(taxableIncome<=500000)) {
				tax2=tax+tax1+(taxableIncome*(100-20))/100;
				System.out.println(tax);
				
			}
			// if its more than 500,000, then the tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.
			else {
				tax3=tax+tax1+tax2+(taxableIncome*(100-30))/100;
				System.out.println(tax3);
			}
				
				
			}			
					
		}


