package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Q: Print the unique value from array by using set
public class D6_MakeProgramToConvertArrayToCollection {
	
	//Method to convertArrayToSet and print
	public static void convertArrayToSet(int[] array){	
		List<int[]> list=Arrays.asList(array);
		
		for(int []arr:list) {
			for(int i:arr) {
				System.out.print(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int [] array= {4,2,5,4,10,15,2,20};
		convertArrayToSet(array); //[2, 4, 20, 5, 10, 15]
		

	}

}
