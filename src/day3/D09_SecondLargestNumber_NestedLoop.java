package day3;

import java.util.Arrays;

public class D09_SecondLargestNumber_NestedLoop {
	

	//method --find the 2nd largest number
	
		public static void findSecondLargestNumber(int arr[]) {
			
			int temp=0;
			
			for(int i=0;i<arr.length;i++) {//outer loop
				for(int j=i+1;j<arr.length;j++) {//inner loop
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
			}
			
			//How array looks like--after sorting by nested loop
			System.out.println(Arrays.toString(arr));
			//pring the 2nd largest number:
			System.out.println(arr[arr.length-2]);
			
			
		}

		public static void main(String[] args) {
			int arr[]= {12,10,100,5};	
			
			findSecondLargestNumber(arr);
		

		}

}
