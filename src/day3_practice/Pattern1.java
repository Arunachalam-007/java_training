package day3_practice;

public class Pattern1 {
	public void patternPrint() {
		int row=5,i,j;
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
