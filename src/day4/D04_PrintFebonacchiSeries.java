package day4;

public class D04_PrintFebonacchiSeries {
	
	public static void printFebonacciSeries(int n) {
		
		int a=0; 
		int b=1;
		int c;	
		System.out.print(a+" "+b+" ");
		if(n>1) {
			for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;	
			
			}
		}
		
	}
	
	public static void main(String[] args) {
		int n=10;
		printFebonacciSeries(3);
	}

}
