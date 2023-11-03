package day1;

public class B02_countASpecificCharacter {
	
	//Q: How many <M> in a given String? 

	//Upercase
	
	//method to count
	public static void countChar(String str) {
		int count=0;
		System.out.println(count);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='M') {
				count++;
			}	
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		countChar("My name is Mamun");

	}

}
