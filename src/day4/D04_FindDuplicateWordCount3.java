package day4;

import java.util.HashSet;
import java.util.Set;

public class D04_FindDuplicateWordCount3 {

	
	
	//Q: Print the duplicate words---*ignoring which comes more than once
	//Q: Print the count of duplicate words---
	
	public static void main(String[] args) {
		String[] arr = {"Mamun","Tanzila","Tanvir","Mamun","Tanzila","Mamun" };
		
		Set<String> duplicateWords=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					duplicateWords.add(arr[i]);
					
				}
			}
			}
		
		System.out.println(duplicateWords);
		System.out.println(duplicateWords.size());
		

	}

}
