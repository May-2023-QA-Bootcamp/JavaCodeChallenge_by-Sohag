package day3;

public class D07_swapInteger {

	
	//using ^ or XOR   XOR=eXclusive OR
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		// output should be a=200 and b=100	
		
		System.out.println("Before swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		
		a=a^b; // 1100100^11001000= 10101100=172
		b=a^b;//10101100^11001000=1100100=100
		a=a^b; //1010110 ^1100100=11001000=200
		System.out.println("After swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		
		

	}

}
