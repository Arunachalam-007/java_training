package day3;

import java.util.Scanner;


public class ScoreCalc {
	int newScore,newScore1,newMark,newMark1;
	public void incCalc() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Score");
		int score=in.nextInt();
		
		if(score<=35) {
			newScore=score++;
			System.out.println(newScore+" "+score);
		}
		else {
			newScore1=++newScore;
			System.out.println(newScore1+" "+newScore);
		}		
	}
	public void decClc() {
		Scanner in1=new Scanner(System.in);
		System.out.println("Enter mark");
		int mark=in1.nextInt();
		
		if(mark>=90) {
			newMark=mark--;
			System.out.println(newMark+" "+mark);
		}
		else {
			newMark1=--newMark;
			System.out.println(newMark1+" "+newMark);
		}
	}

}
