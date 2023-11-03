package day1;

public class A03_characterOneByOneVerticallyButReverse {
	
	//Q: Print your name vertically but reverse way (Showing loop starting number is not the index number…looping is just for traversing purpose)

	public static void main(String[] args) {
		
		String name="Tanzila";
		//to print any specific char 
		//System.out.println(name.charAt(6));
		//to print the length of the string
		//System.out.println(name.length());//7
		
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(name.length()-1-i)); // 7-1-i value=6 5 4 3 2 1 0
		}
		
	}

}
