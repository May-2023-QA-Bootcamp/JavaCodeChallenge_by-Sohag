package day3;

public class D06_swapInteger {

	
	//using * / operator
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		// output should be a=5 and b=10	
		
		System.out.println("Before swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		
		a=a*b; //10*5=50  a=50  b=5
		b=a/b;//50/5=10    b=10  a =50
		a=a/b;
		System.out.println("After swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		
		

	}

}
