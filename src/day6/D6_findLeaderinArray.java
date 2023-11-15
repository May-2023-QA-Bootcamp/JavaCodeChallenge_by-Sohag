package day6;

public class D6_findLeaderinArray {

	public static void main(String[] args) {
		int[]arr= {121, 3, 4, 1, 5, 9,2};
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
				
			}
			
			if(arr[i]>sum) {
				System.out.println(arr[i]);
			}
			
		}

	}

}
