package day1;

public class CountConsonent_ByUsingLength {
	
	
	public static  void countConsonent(String str) {
		
		int vowels=0;
		int consonent=0;
		
		int totalChar = str.length();// vowels+consonent   //5
		
	
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowels++;
			}
		}
		
		consonent=totalChar-vowels;
		
		//System.out.println(vowels);
		System.out.println(consonent);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		String name="Mamun";
		
		countConsonent(name);
		
		
		

	}

}
