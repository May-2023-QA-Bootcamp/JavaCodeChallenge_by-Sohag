package day5;

public class D6_FindPairsFromAnArray {

	public static void main(String[] args) {
		int[]arr= {12,1,2,4,3,5,7};
		int sum=8;
		
		
			for(int j=0; j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[j]+arr[k]==sum) {
						System.out.println("Pairs:"+arr[j]+"+"+arr[k]+"="+sum);
					}
					
				}
			}
	}

}
