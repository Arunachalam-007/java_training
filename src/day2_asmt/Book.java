package day2_asmt;

public class Book {
	
	//To initialize the datamembers for Book class
	String bookName,authorName,publisher;
	int bookPrice,year;
	
	//To use the return type method(String) to return the book name
	public String bookName(String bookName) {
		return bookName;
	}
	
	//To use the non return type method
	public void authorName(String authorName) {
		System.out.println("authorName :"+authorName);
	}
	
	//Use return type method
	public String pulisher(String publisher) {
		return publisher;
	}
	
	//use return type (int) method
	public int bookPrice(int bookPrice) {
		return bookPrice;
	}
	//use return type (int) method
	public int year(int year) {
		return year;
	}
	

}
