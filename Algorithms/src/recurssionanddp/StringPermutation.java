package recurssionanddp;

import java.util.ArrayList;

public class StringPermutation {
    //Time Complexity O(n!)
	public static ArrayList<String> getPermutations(String str){
		
		if(str == null) return null;
		
		ArrayList<String> permutations=new ArrayList<String>();
		
		if(str.length()==0){
			permutations.add("");
			return permutations;
		}
		String firstChar=new String(str.charAt(0)+"");
		permutations.add(firstChar);
		
		for(int i=1;i<str.length();i++){
			
			ArrayList<String> temp_list=new ArrayList<String>();
			char c=str.charAt(i);
			
			for (String word:permutations) {
				for(int j=0;j<=word.length();j++){
					String permute=insertCharAt(word, c,j);
					temp_list.add(permute);
				}
			}
			
             permutations.clear();
             permutations.addAll(temp_list);
		}
		
		return permutations;
	}
	
	public static String insertCharAt(String word,char c,int index){
		String start=word.substring(0,index);
		String end=word.substring(index);
		return start+c+end;
		
	}
	
	public static void main(String[] args) {

		ArrayList<String> permutations=getPermutations("samid");
		System.out.println(permutations.size());
		for (String str : permutations) {
			System.out.println(str);
		}
		
	}

}
