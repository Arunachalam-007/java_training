package string_asmt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringTwo {

	public static void main(String[] args) {
		String s="This is orange juice";
		if(s.contains("orange")) {
			System.out.println("'orange' is found");
//			DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//			String dob="19-09-1976";
//			LocalDate dobDate = LocalDate.parse(dob, datetimeformat);
//			System.out.println(dobDate);
		}
		else {
			System.out.println("'orange' is not found");
		}

	}

}
