package day4_asmt;

public class ExampleString {

	public static void main(String[] args) {

		String name;
		name = "Ram";

		String lastName = new String();
		lastName = "Kumar";

		System.out.println(name + "" + lastName);
		
		char charAt = name.charAt(2);
		name.toUpperCase();
		String concat = name.concat(lastName);
		boolean equals = name.equals(concat);
		System.out.println(equals);
//isBlank;
		
		
		for(char c='1';c<='9';c++) {
			System.out.println("c :"+c);
		}
		String a=2+"      "+3;
		System.out.println("a :"+a);
			}

}
