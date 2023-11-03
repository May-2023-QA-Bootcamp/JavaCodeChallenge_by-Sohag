package day1;

public class A05_reverseTheWordsFromParagraph {

	/*
	 * Q: Write a function to transform input (reverse word by word from a sentence)
	 * e.g.: Input: "Hello_Mohammad Tofael Kabir Sharkar" Output:
	 * 
	 * Hello  
	 * Mohammad
	 * Tofael
	 * 
	 * 
	 * "Sharkar Kabir Tofael Mohammad Hello"
	 * 
	 * Output will be word by word
	 * 
	 */

	// method to print string in reverseway
	public static void reverseMyString(String str) {
		//split() method will separate the words from 
		//sentence based on passing logic
		String[] newString=str.split("\\s"); //----   \s---representing white space
		

		for (int i = newString.length - 1; i >= 0; i--) {
			System.out.print(newString[i]+" ");
		}
	}

	public static void main(String[] args) {
		//calling the method
		reverseMyString("Hello Mohammad Tofael Kabir Sharkar");

	}

}
