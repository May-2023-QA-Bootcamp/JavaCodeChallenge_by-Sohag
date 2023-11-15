package day5;

import java.util.Arrays;

public class D6_findLeadNumberInArray {

	public static void main(String[] args) {
		
		int[]arr= {302,1,2,4,13,5,7};
		//int[]leaders=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			int sum = 0;
			
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
			}
			//System.out.println(sum);
			if(arr[i]>sum) {
				//leaders[i]=arr[i];
				System.out.print(arr[i]+" ");}
		}
		//System.out.println(Arrays.toString(leaders));

		
	}

}
