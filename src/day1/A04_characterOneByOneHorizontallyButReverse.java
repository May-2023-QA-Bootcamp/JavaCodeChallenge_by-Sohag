package day1;

public class A04_characterOneByOneHorizontallyButReverse {
	
	//Q:Print your name vertically but reverse way by calling a method (void)

	
	
	//method to print string in reverseway
	public static void reverseMyString(String str) {

		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		reverseMyString("Tanzila");
		
		
		
		
		
	}

}
