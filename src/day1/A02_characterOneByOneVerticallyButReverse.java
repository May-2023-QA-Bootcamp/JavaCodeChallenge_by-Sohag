package day1;

public class A02_characterOneByOneVerticallyButReverse {
	
	//Q:Print your name vertically but reverse way [They will not mention: character by character]


	public static void main(String[] args) {
		
		String name="Tanzila";
		//to print any specific char 
		//System.out.println(name.charAt(6));
		//to print the lenght of the string
		//System.out.println(name.length());//7
		
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		
	}

}
