package day2;

import java.util.Arrays;

public class D01_largestNumber_Comparing {

	
	// Q: Find the largest number
	
	
	public  static int findLargestNumber(int[] arr) {    //int arr[]= {999,272,33,,100,5000;
		
		int largestNumber=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(largestNumber<arr[i]) {
				largestNumber=arr[i];
			}
		}
		
		
		return largestNumber;
		
	}
	
	
	public static void main(String[] args) {
		
		//an array having some numbers
			
		int arr[]= {272,33,999,100,5000};
		
		System.out.println(findLargestNumber(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
