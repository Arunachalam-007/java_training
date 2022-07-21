package day4;

public class ArrayConceptTest {

	public static void main(String[] args) {
		
		//Array Declaration
		String fruits[]=new String[] {"Apple","Mango","Grapes"}; //Array Declaration and Assigning values
		int numbers[]= {2,4,6,5,9};
		int values[];
		
		
		values=new int[6];
		values[0]=30;
		values[1]=50;
		values[2]=87;
		values[3]=3890;
		values[4]=63872910;
		values[5]=873290;
		
		//for each implementation
		for(int res:values) {
			System.out.println("Values are "+res);
			
		}	
		
		int[] newArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		//print the values by using for loop
		for (int i=0;i<newArray.length;i++) {
			System.out.println("Element at index " + i + " : "+ newArray[i]);
		}
		
//		ArrayConcept.name="aaa";
		
		//Array class concept
		ArrayConcept[] arr;
		arr=new ArrayConcept[4];
		
		arr[0]=new ArrayConcept("Arun", "arun@gmail.com");
		
		arr[1]=new ArrayConcept("Mano", "mano@gmail.com");
		
		arr[2]=new ArrayConcept("Momo", "momo@gmail.com");
		
		arr[3]=new ArrayConcept("Guhan", "guhan@gmail.com");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].name+" "+arr[i].mailId);
		}
			

	}

}
