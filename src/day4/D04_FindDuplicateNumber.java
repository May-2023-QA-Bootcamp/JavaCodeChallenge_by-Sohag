package day4;

import java.util.HashSet;
import java.util.Set;

public class D04_FindDuplicateNumber {

	
	
	//Q: Print the duplicate numbers
	
	
	public static void main(String[] args) {
		int[] arr = {5,10,3,5,4,2,3,4,3 };
		
		Set<Integer> duplicateNumber=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					duplicateNumber.add(arr[i]);
					
				}
			}
			}
		
		System.out.println(duplicateNumber);
		
		for(int n:duplicateNumber) {
			System.out.println(n);
		}
		
		System.out.println(duplicateNumber.size());
		

	}

}
