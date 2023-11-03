package day1;

public class B01_countASpecificCharacter {
	
	//Q: How many <m> in a given String? 

	//lowercase
	
	//method to count
	public static void countChar(String str) {
		int count=0;
		System.out.println(count);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='m') {
				count++;
			}	
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		countChar("my name is mamun");

	}

}
