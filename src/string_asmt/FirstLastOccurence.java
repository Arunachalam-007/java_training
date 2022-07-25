package string_asmt;

public class FirstLastOccurence {

	public static void main(String[] args) {
		String s="Hello,This is mano,Product dept";
		if(s.contains("o")) {
			System.out.println(s.indexOf("o"));
			System.out.println(s.lastIndexOf("o"));
		}
		if(s.contains(",")) {
			System.out.println(s.indexOf(","));
			System.out.println(s.lastIndexOf(","));
		}
	}

}
