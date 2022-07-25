package string_asmt;

import java.util.Arrays;

public class Sorting {
	public void calc() {
		String arr[]= {"melfin","guhan","mano","aashiq","mahesh","karthick","prasanth","hari","momo","thoufiq"};
		Arrays.sort(arr);
		System.out.println("ascending order :");
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
