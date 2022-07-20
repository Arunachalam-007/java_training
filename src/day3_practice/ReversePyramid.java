package day3_practice;

public class ReversePyramid {
	public void pyramidPattern() {
		int rows = 4; 
		for (int i = 1; i <= rows; i++){
		for (int j = 1; j < i; j++){
				System.out.print("1 ");
			}
		for (int j = i; j <= rows; j++){
				System.out.print("");
			}
			System.out.println();
		}
	}
			
	}

