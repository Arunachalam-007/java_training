package day2_asmt;



public class DataMembersMethodTest {

	public static void main(String[] args) {
		BookMethod b=new BookMethod();
		System.out.println("bookName :"+b.bookName("Software Engg"));
		b.authorName("Pressman");
		System.out.println("bookPrice :"+b.bookPrice(879));
		System.out.println("year :"+b.year(2010));
		System.out.println("pulisher :"+b.pulisher("Pearson Publication"));
		
		
		HospitalMethod h=new HospitalMethod();
		System.out.println("amountForAppointment :"+h.amountForAppointment(200.0));
		System.out.println("doctorName :"+h.doctorName("Agarwal"));
		System.out.println("hospitalName :"+h.hospitalName("Apollo"));
		h.location("Chennai");
		System.out.println("speciality :"+h.speciality("Surgeon"));
		
		
		MovieMethod m=new MovieMethod();
		System.out.println("movieName :"+m.movieName("Vikram"));
		System.out.println("director :"+m.director("Lokesh"));
		System.out.println("actor :"+m.actor("Kaml"));
		m.musicDirector("Aniruth");
		System.out.println("releasingYear :"+m.releasingYear(2022));
		
	}

}
