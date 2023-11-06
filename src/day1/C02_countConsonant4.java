package day1;

public class C02_countConsonant4 {

public static void countConsonent(String str) {
	
	//using \\s for white space removing

		int consonent=0;
		
		str=str.replaceAll("\\s","");
		str=str.toLowerCase();
		
		
		
		System.out.println(str);
		
		
		for(int i=0;i<str.length();i++){
			if( str.charAt(i)!='a'&&str.charAt(i)!='i'&&str.charAt(i)!='e'
					&&str.charAt(i)!='o'&&str.charAt(i)!='u'){

				consonent++;
	
		}
			
		
		}
		System.out.println(consonent);
			
	}
	

	public static void main(String[] args) {
		
		String str="This is A cat";
		
		
		countConsonent(str);
		
	}

}
