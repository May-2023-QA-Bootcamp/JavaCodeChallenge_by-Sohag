package day2;

import java.util.Arrays;

public class D01_SmallestNumber_ComparingValue {

	
	// Q: Find the smallest number----using nested loop
	
	
	public  static int findSmallestNumber(int[] arr) {    //int arr[]= {999,272,33,,100,5000;
		
		for(int i=0;i<1;i++) {  //outer loop starts here   1st loop----on  index -0
			for(int j=i+1;j<arr.length;j++) {  //inner loop starts here
				if(arr[i]>arr[j]) {
					
					return arr[j];	
				
			}
					
			}
			
		}//outer loop ends here
		return arr[0];
			
		
	}
	
	
	public static void main(String[] args) {
		
		//an array having some numbers
			
		int arr[]= {272,5,33,999,100,5000,10};
		
		System.out.println(findSmallestNumber(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
