package day3;

public class D06_swapIntege {

	
	//using + - operator
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		// output should be a=5 and b=10	
		
		System.out.println("Before swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		
		a=a-b; //10-5=5  a=5  b=b
		b=a+b;//5+5=10    b=10  
		System.out.println("After swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		
		

	}

}
