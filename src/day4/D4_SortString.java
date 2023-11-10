package day4;

import java.util.Arrays;

public class D4_SortString {

	
	//Q: sort the string
	public static void main(String[] args) {
		String str="enthrall it";
		str=str.replaceAll("\\s","");
		//str=str.replaceAll(" ",""); //you can also do the this to remove white space
		System.out.println(str);
		
		char[] charry=str.toCharArray();
		System.out.println("Before Sorting"+Arrays.toString(charry));
		
		Arrays.sort(charry);
		System.out.println("After Sorting"+Arrays.toString(charry));
		
		for(char c:charry) {System.out.print(c);}

	}

}
