package overloading_asmt;

public class GettersSetters {
	private String name;
	private int rollNo;
	private String Grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "GettersSetters [name=" + name + ", rollNo=" + rollNo + ", Grade=" + Grade + "]";
	}
	
	
}
