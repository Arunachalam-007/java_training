package asmt1;

public class TestClass {

	public static void main(String[] args) {
		Book b=new Book();
		b.authorName="Pressman";
		b.bookName="Software Engg";
		b.bookPrice=879;
		b.publisher="Pearson Publication";
		b.year=2010;
		System.out.println("authorName :"+ b.authorName);
		System.out.println("bookName :"+b.bookName);
		System.out.println("bookPrice :"+b.bookPrice);
		System.out.println("publisher :"+b.publisher);
		System.out.println("year :"+b.year);
		Hospital h=new Hospital();
		h.amountForAppointment=200.0;
		h.doctorName="Agarwal";
		h.hospitalName="Apollo";
		h.speciality="Surgeon";
		h.location="Chennai";
		System.out.println("amountForAppointment :"+h.amountForAppointment);
		System.out.println("doctorName :"+h.doctorName);
		System.out.println("hospitalName :"+h.hospitalName);
		System.out.println("location :"+h.location);
		System.out.println("speciality :"+h.speciality);
		Movie m=new Movie();
		m.actor="Kamal";
		m.director="Lokesh";
		m.movieName="Vikram";
		m.musicDirector="Aniruth";
		m.releasingYear=2022;
		System.out.println("movieName :"+m.movieName);
		System.out.println("actor :"+m.actor);
		System.out.println("director :"+m.director);
		System.out.println("musicDirector :"+m.musicDirector);
		System.out.println("releasingYear :"+m.releasingYear);
		
		

	}

}
