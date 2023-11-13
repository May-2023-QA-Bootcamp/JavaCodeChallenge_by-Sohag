package day5;

public class D5_CheckPalindrom {
	
	//MIOIM
	
	public static boolean isPalindrome(String s) {
		s=s.toUpperCase();
		int i=0;  //0 1 2
		int j=s.length()-1; //4 3 2
		
		for(int k=0;k<s.length();k++) {
				
			if(s.charAt(i)!=s.charAt(j)) {
				
				return false;				
		}	
			
			i++;
			j--;
		
	}
		return true;
		}

	public static void main(String[] args) {
		System.out.println(isPalindrome("AEOIOEA"));
		System.out.println(isPalindrome("jsofj"));
		System.out.println(isPalindrome("Dad"));
		
	}

}
