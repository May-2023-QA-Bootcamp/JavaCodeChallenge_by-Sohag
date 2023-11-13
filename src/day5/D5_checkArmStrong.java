package day5;

public class D5_checkArmStrong {
	
	public static boolean isArmStrongNumber(int n) {
		int orgNum=n;
		int newNum=0;
		int rem=0;
			
		while(n>0) {
			rem=n%10;	
			newNum=	newNum+(rem*rem*rem);
			n=n/10;
		}
		if(orgNum==newNum) {
			return true;
		
		}else {
			return false;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(153));
		System.out.println(isArmStrongNumber(371));
		System.out.println(isArmStrongNumber(372));

	}

}
