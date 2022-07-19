package asmt3;

public class ShopMgmtTest {
	public static void main(String[] args) {
		
		ShopMgmt shMg=new ShopMgmt();
		System.out.println(shMg.customerDetails());
		
		shMg.productDetails("Soap");
		System.out.println(shMg.productAmount(50));
		shMg.paymentOption();
		
		

	}

}
