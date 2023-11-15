package day6;

public class D6_JavaCodeToCheckStringImmutebility {

	public static void main(String[] args) {
		//have a string
		String name="Mamun";
		
		//trying to change string--adding
				//name.concat(" Mohammad"); //if dont refer garbage collector will clean as there is no reference
		name=name.concat(" Mohammad"); //it will produce new string so we can store new string
		//still name is changed
		System.out.println(name);
//System.out.println(Name); //as 
		
		

	}

}
