package day1;

public class C01_countVowel {
	
	//Q: Write a method to find the number of vowels from a String? —converting to lower or upper space  & counting only ‘a’ ‘e’ ‘i’ ‘o’ ‘u’ and converting to lower or upper space
	//They will not mention any approach

	
	//method to countVowels
	public static void countVowels(String str) {
		int countVowels=0;

		for(int i=0;i<str.length();i++) {
			if(str.toUpperCase().charAt(i)=='A' || str.toUpperCase().charAt(i)=='E'
					||str.toUpperCase().charAt(i)=='I' || str.toUpperCase().charAt(i)=='I' 
					|| str.toUpperCase().charAt(i)=='U') {
				
				countVowels++;
			}	
		}
	
		System.out.println(countVowels);
	}

	public static void main(String[] args) {
		countVowels("My name Is Mamun");

	}

}
