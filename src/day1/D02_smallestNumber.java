package day1;

import java.util.Arrays;

public class D02_smallestNumber {

	
	// Q: Find the smallest number
	

	
public  static int findSmallestNumber(int[] arr) {
		
		Arrays.sort(arr);  //33,100,272,500,999
		
		return arr[0];
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//an array having some numbers
			
		int arr[]= {272,33,999,100,500};
		

		System.out.println(findSmallestNumber(arr));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
