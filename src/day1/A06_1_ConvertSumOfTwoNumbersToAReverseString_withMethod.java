package day1;

public class A06_1_ConvertSumOfTwoNumbersToAReverseString_withMethod {
 //Q:Reverse the sum of two numbers
	
	//input int a=10; int b=15;  
	//expecting output=52
	
	//if we create method which will print reversely
	
	public static void reverseNumber(int a,int b) {
		//adding two numbers
		int sum=a+b; 
		//converting int to String
		String newNumber=String.valueOf(sum);
		//looping to print from the last
		for(int i=newNumber.length()-1;i>=0;i--) {
			System.out.print(newNumber.charAt(i));
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		reverseNumber(10,15);
		//You can also directly use the logic in main method without creating method
				/*int a=10;
				int b=15;
				
				int sum=a+b;
				//System.out.println(sum);
				
				String newNumber=String.valueOf(sum);   // "index 0=2, index 1=5"
				
				System.out.println(newNumber);  //"25"
				
				
				for(int i=newNumber.length()-1;i>=0;i--) {
					System.out.print(newNumber.charAt(i));
					
				}
				
				*/
		
	}

}
