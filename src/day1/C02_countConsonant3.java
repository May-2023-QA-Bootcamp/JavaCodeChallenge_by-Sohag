package day1;

public class C02_countConsonant3 {

public static void countConsonent(String str) {

		int consonent=0;
		
		for(int i=0;i<str.length();i++){
			if( str.charAt(i)!='a'&&str.charAt(i)!='i'&&str.charAt(i)!='e'
					&&str.charAt(i)!='o'&&str.charAt(i)!='u'&&str.charAt(i)!=' '){

				consonent++;
	
		}
			
		
		}
		System.out.println(consonent);
			
	}
	

	public static void main(String[] args) {
		
		String str="My name mamun";
		
		
		countConsonent(str);
		
	}

}
