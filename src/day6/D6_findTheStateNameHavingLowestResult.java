package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D6_findTheStateNameHavingLowestResult {

	public static void main(String[] args) {
		//Q: Print the State name having lowest temp
		
		
		//state is KeY    and Temp is Value
		// one key-vlaue   is one entry
		//all the keys together is keySet
		Map<String,Integer> map=new HashMap<>();
		map.put("NY",50);
		map.put("NJ",45);
		map.put("VA",58);
		map.put("CT",42);
		map.put("PA",40);
		
		//System.out.println(map.get("NY"));
		//keySet() will contain all the keys-----returs as a set
		Set<String>keys=map.keySet();
		//System.out.println(keys);
		String lowestTempState="NY";
		int lowestTemp=map.get(lowestTempState);
		//forEach loop/enhanced loop/ advanced loop
		for(String k:keys) {
			//System.out.println(map.get(k));
			if(map.get(k)<lowestTemp) {
				lowestTemp=map.get(k);
				lowestTempState=k;		
			}	
		}
		System.out.println(lowestTempState+":"+lowestTemp);
	}
}
