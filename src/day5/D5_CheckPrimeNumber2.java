package day5;

public class D5_CheckPrimeNumber2 {
	public static boolean isPrimeNumber(int n) {
		if(n<2) {
			
			return false;	
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;	
	}
	// witll print all prime numbers
	public static void printPrimeNumber(int n) {
		for(int i=0;i<=n;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		printPrimeNumber(50);
	}

}
