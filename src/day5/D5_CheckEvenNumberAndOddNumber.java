package day5;

public class D5_CheckEvenNumberAndOddNumber {
	
	public static void printEvenOrOdNumber(int n) {
		if(n%2==0) {
			System.out.println(n+"  is an even number");
		}else {
			System.out.println(n+"  is an odd number");}
	}
	

	public static void main(String[] args) {
		printEvenOrOdNumber(5);
		printEvenOrOdNumber(10);

	}

}
