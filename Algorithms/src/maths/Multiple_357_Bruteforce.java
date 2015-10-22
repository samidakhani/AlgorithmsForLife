package maths;

import java.util.ArrayList;
import java.util.Collections;

public class Multiple_357_Bruteforce {

	//Time Complexity O(N2 log N)
	
	public static int getMin(ArrayList<Integer> list){
		Collections.sort(list);
		return list.get(0);
	}
	
	public static void addMultiples(ArrayList<Integer> list, int q){
		
		if(!list.contains(q*3))
		    list.add(q * 3);

		if(!list.contains(q*5))
	        list.add(q * 5);
		
		if(!list.contains(q*7))
	        list.add(q * 7);
	}
	
	
	public static int get_kth_number(int k){
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		
		int min=0;
		for (int i = 0; i <= k; i++) {
			min=getMin(list);
			list.remove(0);
			addMultiples(list,min);
		}
		
		return min;
	}
	
	public static void main(String[] args) {
	    System.out.println(get_kth_number(12));
	}

}
