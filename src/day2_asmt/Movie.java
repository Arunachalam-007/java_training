package day2_asmt;

public class Movie {
	String movieName,director,musicDirector,actor;
	int releasingYear;	
	
	//Use Return type method
	public String movieName(String movieName) {
		return movieName;
		
	}
	//Use Return type method
	public String director(String director) {
		return director;
		
	}
	//Use Non Return method
	public void musicDirector(String musicDirector) {
		System.out.println("musicDirector :"+musicDirector);
		
	}
	//Use Return type method
	public int releasingYear(int releasingYear) {
		return releasingYear;
		
	}
	//Use Return type method
	public String actor(String actor) {
		return actor;
		
	}

}
