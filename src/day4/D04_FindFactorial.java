package day4;

public class D04_FindFactorial {

	
	//Q: write code to find factorial of a number--looping approach
	public static void main(String[] args) {
		int n=5;
		//5*4*3*2*1=120
		int m=n;
		for(int i=n-1;i>0;i--) {
			m=m*i;
		}
		
		System.out.println(m);

	}

}
