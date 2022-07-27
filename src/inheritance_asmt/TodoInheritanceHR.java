package inheritance_asmt;

public class TodoInheritanceHR extends TodoInheritanceMadurai{

//	public int id=super.id;
//	public String location=super.location;
	
	public void process() {
		System.out.println("Id should be 2999 and location should be madurai");
		super.process(super.id,super.location);
	}
}
