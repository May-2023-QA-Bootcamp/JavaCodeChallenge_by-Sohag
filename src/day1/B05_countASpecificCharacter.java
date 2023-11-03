package day1;

public class B05_countASpecificCharacter {
	
	//Q: How many <m/M> together in a given String? 

	//using || operator----OR checking either one
	
	//method to count
	public static void countChar(String str) {
		int count=0;

		System.out.println(count);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='m' || str.charAt(i)=='M') {
				
				count++;
			}	
		}
	
		System.out.println(count);
	}

	public static void main(String[] args) {
		countChar("My name is Mamun");

	}

}
