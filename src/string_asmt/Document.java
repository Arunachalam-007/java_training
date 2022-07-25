package string_asmt;

public class Document {

	public static void main(String[] args) {
		StringBuilder sbl=new StringBuilder("Arun");
		StringBuffer sbf =new StringBuffer("Momo");//Thread safe
		sbl.append("achalam");
		sbf.append("ashiq");
		System.out.println("StringBuilder "+sbl);
		System.out.println("StringBuffer "+sbf);
		
	
		

	}

}
