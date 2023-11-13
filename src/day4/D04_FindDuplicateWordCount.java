package day4;

public class D04_FindDuplicateWordCount {

	public static void main(String[] args) {
		
		String[] arr = {"Mamun","Tanzila","Tanvir","Mamun","Tanzila","Mamun" };
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			
			
		}
		System.out.println(count);
		
		

	}

}
