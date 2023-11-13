package day5;

public class D5_FebonacchiSeriesWithRecursiveMethod {
 // 0  1  1
	
	static int a=0;
	static int b=1;
	static int c;
	
	public static void printFebonacchiSeries(int n) {
		
		c=a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
		if(n!=0) {
		
		printFebonacchiSeries(n-1);
		}	
		
	}
	
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		printFebonacchiSeries(10);

	}

}
