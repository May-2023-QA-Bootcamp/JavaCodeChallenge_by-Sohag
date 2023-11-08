package day3;

public class D03_findSumOfLargestAndSmallestNumber {

	public static void findSamllestAndLargestNumber(int arr[]) {
		int smNumber = arr[0];
		int LnNumber = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > LnNumber) {
				LnNumber = arr[i];
			} else if (arr[i] < smNumber) {
				smNumber = arr[i];
			}
		}

		System.out.println("Sum:"+(smNumber+LnNumber));
		

	}

	public static void main(String[] args) {

		int arr[] = { 5, 2, 100, 50, 200 };

		findSamllestAndLargestNumber(arr);

	}

}
