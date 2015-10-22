package stringarray;

import java.util.Arrays;

public class Check_Strings_permutation {
// Time complexity O(n log n)
	public static String sort(String str){
		
	   char[] chars=str.toCharArray();
	   Arrays.sort(chars);
	   return new String(chars);
	
	}
	public static void main(String[] args) {
		
		String str1="sami";
		String str2="iasm";
		if(str1.length() != str2.length()){
			System.out.println(false);
			return;
		}
		
		boolean check_permute=sort(str1).equals(sort(str2));
		System.out.println(check_permute);
	}

}
