package day5;
//q: print all Prime Number from 0 to 50
public class D5_CheckPrimeNumber_count {
	//method to check given number is prime or not:
	public static boolean isPrimeNumber(int n) {
		if (n < 2) {  //skiping if the n value is less than  2
			return false;
		}
		for (int i = 2; i < n; i++) { //checking reminder is 0 or not by using n%i(here i value will be 2 to (n-1)
			if (n % i == 0) {
				return false;
			}
		}
		return true; //if n value does'nt match above both condition then returns true
	}

	// method to print all prime numbers:
	public static void printPrimeNumber(int number) {
		int count=0;
		for (int j = 0; j <= number; j++) {
			if (isPrimeNumber(j)) {//checking j value is prime number
				//System.out.print(j + " ");
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		//call the method to print all prime number up to 50
		printPrimeNumber(50);
		

	}

}
