package inheritance_asmt;

public class TodoInheritanceChennai {
	public int hours=8;
	public boolean permissionForLeave=false;
	public void assignTask(int hours,boolean permissionForLeave) {
		if((hours>=8)&&(!permissionForLeave)) {
			System.out.println("U should Complete the tasks which are already assigned");
			
		}
		else {
			System.out.println("U can leave");
			
			
		}
		
		
	}

}
