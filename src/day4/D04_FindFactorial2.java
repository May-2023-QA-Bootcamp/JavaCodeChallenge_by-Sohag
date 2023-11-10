package day4;

public class D04_FindFactorial2 {

	
	//Q: write code to find factorial of a number--recursive approach
	//when method is calling itself
		
	public static int factorialCal(int n) {
		if(n==0) {
			return 1;
		}else {	
		
		return n*factorialCal( n-1);     //5*4*3*2*1
	}
	
	}
	
	public static void main(String[] args) {
		int n=5;
		System.out.println(factorialCal(n));
		

	}

}
