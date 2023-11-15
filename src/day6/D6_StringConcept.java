package day6;

public class D6_StringConcept {

	public static void main(String[] args) {
		//by default if we create String literal way (intern() method is called---which responsible to check string is there or not
		String name="Mamun";  //will store in SCP (special area in HEAP)
		String name1="Mamun";  //will store in SCP 
		
		//Creating string by calling the constructor
		String name2=new String("Mamun");//will not store in SCP--will be in heap area
		String name3=new String("Mamun");//will not store in SCP--will be in heap area
		
		
		//using == operator>>>>>>checking memory location
		System.out.println(name==name1); //ture 
		System.out.println(name2==name3); //false>>because name2 and name3 in heap area but seperately
		System.out.println(name==name2); //false>>because name2 in heap ara and name in SCP
		
		
		//using equals()------equls() is in Object class>>>>checking contents 
		System.out.println(name.equals(name1));  //true
		System.out.println(name2.equals(name3));  //true
		System.out.println(name.equals(name3));  //true
		
		
		String name4=new String("Mamun");
		System.out.println(name==name4.intern());//Ture
		
	}

}
