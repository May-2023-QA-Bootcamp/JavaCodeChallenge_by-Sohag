package day1;

public class A06_ConvertSumOfTwoNumbersToAReverseString {
	// Q:Reverse the sum of two numbers

	// input int a=10; int b=15;
	// expecting output=52

	public static void main(String[] args) {

		int a = 10;
		int b = 15;

		int sum = a + b;
		// System.out.println(sum);

		String newNumber = String.valueOf(sum); // "index 0=2, index 1=5"

		//System.out.println(newNumber); // "25"

		for (int i = newNumber.length() - 1; i >= 0; i--) {
			System.out.print(newNumber.charAt(i));

		}

	}

}
