package day5;

public class D5_CheckPrimeNumber {
	
	//Q: Check the given number is PrimeNumber or not
	//What is PrimeNumber: the number dividable by 1 or itself    3---you can divide 3 by 3 or by 1  
	// Prime number is number more than 1
	//negative approach---we will divide by 2 and by same number
	//30/2  30/3............30/30
	
	public static boolean isPrimeNumber(int n) {
		if(n<2) {
			
			return false;	
		}
		
		for(int i=2;i<n/2;i++) {
			if(4%i==0) {
				return false;
			}
			
		}
		return true;	
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(25));
		System.out.println(isPrimeNumber(27));
		System.out.println(isPrimeNumber(7));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(29));

	}

}
