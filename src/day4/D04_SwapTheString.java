package day4;

public class D04_SwapTheString {
	
	
	/** Q: Swap String–using subString() logic
Example: String x=”Enthrall”   String y=”IT”
Output=x=IT   y=Enthrall
x+y=EnthrallIT
y=Enthral
x=IT
*/

	public static void main(String[] args) {
		
		String x="Enthrall";
		//System.out.println(x.substring(0,4));
		//System.out.println(x.length());
		String y="IT";
		
		//apending
		
		String z=x+y;
		//System.out.println(z.length());
		
		y=z.substring(0,x.length());  ///Enthrall
		//System.out.println(y);
		x=z.substring(x.length(),z.length());
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
