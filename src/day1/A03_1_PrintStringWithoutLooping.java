package day1;

public class A03_1_PrintStringWithoutLooping {
	
	//Q:Print your name reverse way without looping

	public static void main(String[] args) {
		
		String schoolName="EnthrallIT";
		
		StringBuilder reverseString=new StringBuilder(schoolName);
		String newString=reverseString.reverse().toString();
		
		System.out.println(newString);
		
		//forEachLoop
		for(int i=0;i<newString.length();i++) {
			System.out.print(newString.charAt(i));
		}
		
		
		

	}

}
