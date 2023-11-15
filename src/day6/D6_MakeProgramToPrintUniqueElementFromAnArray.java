package day6;

import java.util.HashSet;
import java.util.Set;

//Q: Print the unique value from array by using set
public class D6_MakeProgramToPrintUniqueElementFromAnArray {
	
	//Method to convertArrayToSet and print
	public static void convertArrayToSet(int[] array){	
		Set<Integer> set=new HashSet<>();
		for(int t:array) {
			set.add(t);
		}
		
		System.out.println(set);
		
	}
	
	public static void main(String[] args) {
		int [] array= {4,2,5,4,10,15,2,20};
		convertArrayToSet(array); //[2, 4, 20, 5, 10, 15]
		

	}

}
