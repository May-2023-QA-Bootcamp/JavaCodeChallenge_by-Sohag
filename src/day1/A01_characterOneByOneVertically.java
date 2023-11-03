package day1;

public class A01_characterOneByOneVertically {
	
	//Q: Print your name vertically

	public static void main(String[] args) {
		
		String name="Tanzila";
		//to print any specific char 
		System.out.println(name.charAt(5));
		//to print the lenght of the string
		System.out.println(name.length());//7
		
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
	}

}
