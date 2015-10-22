package stringarray;

import java.util.Arrays;

public class Unique_Characters_In_Array_NO_Structures {
	// Time complexity O(n log n) + O (n) = O(n log n)
	// Space complexity O(1)
	
	public static void main(String[] args) {
		
		boolean unique=true;
		String str="sami";
		char[] chars= str.toCharArray();
		Arrays.sort(chars);
		
		for(int i=0;i<=chars.length-2;i++){
			
			if(chars[i]==chars[i+1]){
				System.out.println("Not unique chracters");
				unique=false;
				break;
			}
		}
		
		 if(unique){
	    	  System.out.println(" unique chracters");
	      }

	}

}
