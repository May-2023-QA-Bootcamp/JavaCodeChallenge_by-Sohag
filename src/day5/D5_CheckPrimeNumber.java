package day5;

public class D5_CheckPrimeNumber {	
	//Q: Check the given number is PrimeNumber or not
	//What is PrimeNumber: the number divisible by 1 or itself  Ex:3---you can divide 3 by 3 or by 1  
	// Prime number is number more than 1
	
	//negative approach---we will divide by 2 and by same number
	public static boolean isPrimeNumber(int n) {
		if(n<2) {//making sure given number is not less than 2 if so will not a prime number		
			return false;	
		}
		//in a loop we will check given number produces 0 at any iterate when try to find reminder with %i
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}		
		}
		return true;	//if given number does't match with above two condition then method returns true
	}
	public static void main(String[] args) {
		System.out.println("9:"+isPrimeNumber(9));
		System.out.println("27:"+isPrimeNumber(27));
		System.out.println("7:"+isPrimeNumber(7));
		System.out.println("3:"+isPrimeNumber(3));
		System.out.println("1:"+isPrimeNumber(1));
		System.out.println("29:"+isPrimeNumber(29));
	}
}
