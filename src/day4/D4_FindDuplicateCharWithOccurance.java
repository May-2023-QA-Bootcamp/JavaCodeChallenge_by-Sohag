package day4;

import java.util.HashMap;
import java.util.Map;

public class D4_FindDuplicateCharWithOccurance {

	public static void main(String[] args) {
		String str="My name is Maumun";
		str=str.toLowerCase();
		str=str.replaceAll(" ","");	
		//key=char  value=occurance
		//get(key)-----return the value
		//put(k,v)------store as k,v pair in hashMap obje	
		//keySt()=====return all keys in a set
		

		HashMap<Character,Integer> duplicateChar=new HashMap<>();
		//System.out.println(duplicateChar.size());
		
		for(int i=0;i<str.length();i++) {
			if(duplicateChar.get(str.charAt(i))==null) {
				
				duplicateChar.put(str.charAt(i),1);
			}else {
				int occurance =duplicateChar.get(str.charAt(i));
				duplicateChar.put(str.charAt(i),occurance+1);
			}
				}	
		//System.out.println(duplicateChar.size());	
		//using for each loop
		for(char k:duplicateChar.keySet()) {
			
			if(duplicateChar.get(k)>1) {
				System.out.println(k+"-"+duplicateChar.get(k));
			}		
		}	
	}

}
