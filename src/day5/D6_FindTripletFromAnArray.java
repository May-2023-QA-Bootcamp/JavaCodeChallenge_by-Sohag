package day5;

public class D6_FindTripletFromAnArray {

	public static void main(String[] args) {
		int[]arr= {12,1,2,4,3,5,9};
		int sum=8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("Triplet:"+arr[i]+"+"+arr[j]+"+"+arr[k]+"="+sum);
					}
					
				}
			}
		}

	}

}
