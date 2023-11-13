package day5;

public class D5_Palindrome_number {

	public static boolean isPalindromeNumber(int n) {
		int originalNumber=n;
		int newNumber=0;
		int reminder=0;
		
		while(n>0) {
			reminder=n%10;  // 121/10=12(Qutient)  1(reminder)   
			newNumber=(newNumber*10)+reminder;
			n=n/10;
			
		}
		
		if(originalNumber==newNumber) {
			return true;
		}else {
			return false;
		}	
	}	
	
	public static void main(String[] args) {
		
		System.out.println(isPalindromeNumber(5051));
		
	}

}
