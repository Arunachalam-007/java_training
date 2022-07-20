package day2_asmt;



public class DataMembersTest {

	public static void main(String[] args) {
		
		//To pass the values for Book class
		Book b=new Book();
		System.out.println("bookName :"+b.bookName("Software Engg"));
		b.authorName("Pressman");
		System.out.println("bookPrice :"+b.bookPrice(879));
		System.out.println("year :"+b.year(2010));
		System.out.println("pulisher :"+b.pulisher("Pearson Publication"));
		
		//Pass the values for Hospital class
		Hospital h=new Hospital();
		System.out.println("amountForAppointment :"+h.amountForAppointment(200.0));
		System.out.println("doctorName :"+h.doctorName("Agarwal"));
		System.out.println("hospitalName :"+h.hospitalName("Apollo"));
		h.location("Chennai");
		System.out.println("speciality :"+h.speciality("Surgeon"));
		
		//Pass the values for Movie class
		Movie m=new Movie();
		System.out.println("movieName :"+m.movieName("Vikram"));
		System.out.println("director :"+m.director("Lokesh"));
		System.out.println("actor :"+m.actor("Kaml"));
		m.musicDirector("Aniruth");
		System.out.println("releasingYear :"+m.releasingYear(2022));
		
	}

}
