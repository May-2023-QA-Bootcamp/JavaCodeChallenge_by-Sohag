package day5;

public class D5_dimondShape {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) { // outer loop

			// inner loop to print white space
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print x then white space
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println(); // it is in outerloop block--producing line

		}
		for (int i = 0; i < n; i++) { // outer loop

			// inner loop to print white space
			for (int j = 0; j <=i; j++) {
				System.out.print(" ");
			}
			// inner loop to print x then white space
			for (int k=n-i; k >0; k--) {
				System.out.print("* ");
			}

			System.out.println(); // it is in outerloop block--producing line

		}

	}

}
