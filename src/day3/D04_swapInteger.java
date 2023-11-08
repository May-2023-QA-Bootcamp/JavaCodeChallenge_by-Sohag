package day3;

public class D04_swapInteger {

	// Q: swaping two values with temp/3rd variable

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		// output should be a=5 and b=10
		
		System.out.println("Before swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);

		// geting temp varibale so that we can preserve a value (a or b)

		int c = a;
		a = b;  //one swaping is done
		b=c; //2nd swaping is done
		System.out.println("Before swaping-----");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);

	}

}
