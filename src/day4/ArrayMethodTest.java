package day4;

import java.util.Arrays;

public class ArrayMethodTest {

	public static void main(String[] args) {
		
		//Binary search Method
		
		int arr[]= {39,82,16,819,10,219,11};
		int arr1[]= {82,54,10,29,11};
			
		//Sort
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int search=16;

		System.out.println("Binary Search Index :"+Arrays.binarySearch(arr, search));	
		
		//CopyOf method
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("New Array");
		
		System.out.println(Arrays.toString(Arrays.copyOf(arr1, 7)));
		
		//Equals method
		
		System.out.println(Arrays.equals(arr, arr1));
		
		//Mis match method
		
		int arr3[] = { 10, 20, 15, 22, 35 };
		int arr4[] = { 10, 15, 22 };
//		System.out.println(Arrays.mismatch(arr3, arr4);
//		
//		System.out.println("The element mismatched at index :"+Arrays.mismatch(arr3, arr4));
		
	

	}
	

}
