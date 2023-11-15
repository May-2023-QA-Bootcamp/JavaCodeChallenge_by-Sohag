package day6;

import java.util.ArrayList;

public class D6_JoinTwoArrayListIntOneArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList();
	list1.add(5);
	list1.add(50);
	list1.add(51);
	list1.add(25);
	
	//System.out.println(list1);

	ArrayList<Integer> list2=new ArrayList();
	list2.add(100);
	list2.add(101);
	//System.out.println(list2);
	//joining list2 with list1	
	list1.addAll(list2);
	System.out.println(list1);
	
	}

}
