package day2;

public class C02_countConsonant_2 {
	
	
	//method to count Consonent
	
	public static void countConsonent(String str) {
		
		//||------or
		// &&------and
		
		
		int consonent=0;
		
		for(int i=0;i<str.length();i++){
			if( str.charAt(i)!='a'&&str.charAt(i)!='i'&&str.charAt(i)!='e'
					&&str.charAt(i)!='o'&&str.charAt(i)!='u'){

				consonent++;
	
		}
			
		
		}
		System.out.println(consonent);
			
	}
	

	public static void main(String[] args) {
		
		String str="mamun";
		
		
		countConsonent(str);
		
	}

}
