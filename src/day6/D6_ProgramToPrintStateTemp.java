package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class D6_ProgramToPrintStateTemp {

	public static void main(String[] args) {
		//Q: Print the State temp when state name is passing from keyboard
		
		
		//state is KeY    and Temp is Value
		// one key-vlaue   is one entry
		//all the keys together is keySet
		Map<String,Integer> map=new HashMap<>();
		map.put("NY",50);
		map.put("NJ",45);
		map.put("VA",58);
		map.put("CT",42);
		map.put("PA",40);
		
		//System.out.println(map.get("NY")); //just to see the value when we pass key
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter short code of the state NY NJ VA CT PA");
		String State=sc.nextLine();
		sc.close();
		System.out.println("The Temp. of "+State+":"+map.get(State));
	}
}
