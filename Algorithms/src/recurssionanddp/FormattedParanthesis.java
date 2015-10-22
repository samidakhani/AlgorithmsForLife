package recurssionanddp;

import java.util.ArrayList;

public class FormattedParanthesis {

	public static String insertParens(String word,int index){
		
		String parens="()";
		String start=word.substring(0,index);
		String end=word.substring(index);
		return start + parens + end;
	}
	
	public static ArrayList<String> generateParens(int count){
		
		if(count == 0)
			return null;
		
		ArrayList<String> parensSet=new ArrayList<String>();
		String parens="()";
		parensSet.add(parens);
		
		for(int i=2;i<=count;i++){
			
			ArrayList<String> tempSet=new ArrayList<String>();
			
			for (String set : parensSet) {
				
				for(int j=0;j<set.length();j++){
					String word=insertParens(set,j);
					if(!tempSet.contains(word)){
						tempSet.add(word);
					}
				}
				
			}
			
			parensSet.clear();
			parensSet.addAll(tempSet);

		}
		
		return parensSet;
		
	}
	
	public static void main(String[] args) {
	
     ArrayList<String> parensSet=generateParens(0);
      for (String str : parensSet) {
		System.out.println(str);
	  }
	}

}
