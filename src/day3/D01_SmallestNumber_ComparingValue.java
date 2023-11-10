package day3;

import java.util.Arrays;

public class D01_SmallestNumber_ComparingValue {

	
	// Q: Find the smallest number----using nested loop
	
	
	//producing wrong result---we have solution for this approach
	
	
	public  static void findSmallestNumber(int[] arr) {    //int arr[]= {999,272,33,,100,5000;
		
		
		int lowestNumber=arr[0];;
		
		for(int i=0;i<3;i++) {  //outer loop starts here   1st loop----on  index -0
			for(int j=i+1;j<arr.length;j++) {  //inner loop starts here
				if(arr[i]>arr[j]) {
					lowestNumber=arr[j];
					
			}
					
			}
			
		}//outer loop ends here
		
		
		
		System.out.println(lowestNumber);
		
	}
	
	
	public static void main(String[] args) {
		
		//an array having some numbers
			
		int arr[]= {12, 2, 100, 5};
		
		findSmallestNumber(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
