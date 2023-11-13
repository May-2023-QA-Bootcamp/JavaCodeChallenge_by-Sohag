package day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D04_FindDuplicateCharacter {

	
	
	//Q: Print the duplicate character---*ignoring which comes more than once
	
	
	public static void main(String[] args) {
		String str = "Mamunnm";
		str=str.toLowerCase();
		
		Set<Character> duplicateChar=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {  //this is line where you are checking same char or not
					
					duplicateChar.add(str.charAt(i));
					
				}
			}
			}
		
		System.out.println(duplicateChar);
		System.out.println(duplicateChar.size());
		

	}

}
