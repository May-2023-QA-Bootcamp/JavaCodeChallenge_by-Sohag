package day6;

public class D6_checkPairMatchesGivenNumber {
//find the pair
	public static void main(String[] args) {
		int[]arr= {12, 3, 4, 1, 5, 9,2};
		int checkValue=8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==8) {
					System.out.println(arr[i]+"+"+arr[j]+"="+checkValue);
				}
				
				
			}
		}

	}

}
