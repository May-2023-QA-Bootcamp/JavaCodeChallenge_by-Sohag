package day6;

public class D6_checkTriplet {

	public static void main(String[] args) {
		int[]arr= {12, 3, 4, 1, 5, 9,2};
		int checkValue=8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==8) {
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+checkValue);
					}
				}
			}
		}

	}

}
