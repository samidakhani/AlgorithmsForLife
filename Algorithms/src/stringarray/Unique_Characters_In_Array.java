package stringarray;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;


public class Unique_Characters_In_Array {
// Time complexity O(n)
// Space complexity O(n)
   public static void main(String args[]){
	
	   String check="sa";
	   boolean unique=true;
	   ArrayList<Character> array= new ArrayList<Character>();
	   
	   char[] chars=check.toCharArray();
	   
       for (char c : chars) {
		if (array.contains(c)){
			System.out.println("Not unique chracters");
			unique=false;
			break;
		}
		array.add(c);
	}
       
      if(unique){
    	  System.out.println(" unique chracters");
      }
       
   }
}
