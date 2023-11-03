package day1;

public class B04_countASpecificCharacter {
	
	//Q: How many <m/M> together in a given String? 

	//toLowerCase
	
	//method to count
	public static void countChar(String str) {
		int count=0;

		System.out.println(count);
		for(int i=0;i<str.length();i++) {
			if(str.toLowerCase().charAt(i)=='m') {
				
				count++;
			}	
		}
	
		System.out.println(count);
	}

	public static void main(String[] args) {
		countChar("My name is Mamun");

	}

}
