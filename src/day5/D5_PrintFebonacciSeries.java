package day5;

import java.util.Arrays;

public class D5_PrintFebonacciSeries {
	//having an array--then using loop and using i value--put the value in the index
	
	public static void printFebonacciSeries(int n) {
		
		//adding prev two numbers  0+1=1   1+1=2
		//0 1 1 2 3 ..........
		
		// array to hold the numbers
		int[] fibo=new int[n];
		
		for(int i=0;i<n;i++) {
			if(i<2) {
				fibo[i]=i;
			}else {
				
				fibo[i]=fibo[i-1]+fibo[i-2];  
			}					
		}
		System.out.println(Arrays.toString(fibo));

	}
	
	public static void main(String[] args) {
		printFebonacciSeries(10);

	}

}
