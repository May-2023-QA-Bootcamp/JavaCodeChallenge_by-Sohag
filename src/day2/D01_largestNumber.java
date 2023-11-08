package day2;

import java.util.Arrays;

public class D01_largestNumber {

	
	// Q: Find the largest number
	
	
	
	public  static int findLargestNumber(int[] arr) {
		
		Arrays.sort(arr);  //33,100,272,500,999
		
		return arr[arr.length-1];
		
	}
	
	

	
	
	
	
	
	public static void main(String[] args) {
		
		//an array having some numbers
			
		int arr[]= {272,33,999,100,500};
		
		System.out.println(findLargestNumber(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
