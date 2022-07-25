package overloading_asmt;

public class StudentOverloading {
	//Data members
	public String name;
	public int age;
	public String address;
	
	//Constructor
	public StudentOverloading() {
		name="unknown";
		age=0;
		address="not available";
	}
	
	//Non return type method 
	public void setInfo(String name,int age) {
		System.out.println("Name is :"+name);
		System.out.println("Age is "+age);
		
	}
	public void setInfo(String name,int age,String address) {
		System.out.println();
		System.out.println("***************************************");
		System.out.println("Name is :"+name);
		System.out.println("Age is "+age);
		System.out.println("Address is :"+address);
		
	}

	@Override
	public String toString() {
		return "StudentOverloading [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


}
