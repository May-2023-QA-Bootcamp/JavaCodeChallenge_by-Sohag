package day3;

import java.util.Arrays;

public class D08_secondLargestNumber {
	
	
	//method --find the 2nd largest number
	
	public static int findSecondLargestNumber(int arr[]) {
//		System.out.println("Before sorting");
//	
//		System.out.println(Arrays.toString(arr));
//		
//		
//		System.out.println("after sorting");
		
		Arrays.sort(arr);
		//after sorting
		//System.out.println(Arrays.toString(arr));
		
		System.out.println();
	
		return arr[arr.length-2];
		
	}

	public static void main(String[] args) {
		int arr[]= {5,100,2,800,6};	
		
		int secondLargestNumber=findSecondLargestNumber(arr);
		System.out.println(secondLargestNumber);

	}

}
