package day6;

public class D6_FindExtremaFromAnArray {

	public static void main(String[] args) {
		int[]arr= {121, 3, 4, 1, 5, 9,2};  //3  1 5 9
		
		
		for(int i=1;i<arr.length-1;i++) {
			int candidate=arr[i];
			int leftNeighbour=arr[i-1];
			int rightNeighbour=arr[i+1];
			
			if(candidate>leftNeighbour+rightNeighbour ||candidate<leftNeighbour+rightNeighbour) {
				System.out.print(candidate+" ");
			}
		}

	}

}
