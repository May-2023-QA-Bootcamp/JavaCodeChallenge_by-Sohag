package day4;

public class D04_FindDuplicateWordCount2 {

	
	
	//Q: Print the duplicate words---*it will print duplicate words multiple times
	
	public static void main(String[] args) {
		String[] arr = {"Mamun","Tanzila","Tanvir","Mamun","Tanzila","Mamun" };
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
			
			
			
		}
		
		
		

	}

}
