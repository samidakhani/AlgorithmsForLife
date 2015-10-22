package sorting;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;


/*public class AnagramComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
            o1.compareTo(o2);
	}
  }

Arrays.sort(array,new AnagramComparator() );*/


public class SortAnagrams {
    //Time complexity O(n log n)
	public static String sortChars(String str){
	  char[] chars=str.toCharArray();
	  Arrays.sort(chars);
	  return new String(chars);
	}
	
	public static void sort(String[] strings){
		
		Hashtable<String, LinkedList<String>> hash=new Hashtable<String, LinkedList<String>>();
		
		for (String str : strings) {
		   
			String key=sortChars(str);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagram= hash.get(key);
			anagram.add(str);
		}
		
		int index=0;
		for (String key : hash.keySet()) {
			LinkedList<String> anagrams= hash.get(key);
            Iterator<String> iterator=anagrams.iterator();
			while(iterator.hasNext()){
				strings[index++]=iterator.next();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String[] a={"sami","asmi","aq","losangeles","angeleslos"};
		sort(a);
		for (String string : a) {
		 System.out.print(string + " ");	
		}

	}

}
