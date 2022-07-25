package overloading_asmt;

public class Bank {
	//Data members
	public int bank1;
	public int bank2;
	public int bank3;
	public Bank(int bank1,int bank2,int bank3) {
		this.bank1=bank1;
		this.bank2=bank2;
		this.bank3=bank3;
	}
	@Override
	public String toString() {
		return "Bank [bank1= $" + bank1 + ", bank2= $" + bank2 + ", bank3= $" + bank3 + "]";
	}
	public int getBalance() {
//		int saving=2000;
		int withdrawAmt=500;
		
		int balance=bank3-withdrawAmt;
		return balance;
	}
	public int getBalance(int withdraAmt) {
		
		int balance=bank2-withdraAmt;
		
		return balance;
	}
}
