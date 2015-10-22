package recurssionanddp;

import java.util.ArrayList;

public class Subsets {

	//Time complexity = O(n2)
	public static ArrayList<ArrayList<Integer>> getSubsets(int[] a){
		
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < a.length; i++) {
			
			ArrayList<ArrayList<Integer>> temp=new ArrayList<ArrayList<Integer>>();
			
			for (ArrayList<Integer> set: result) {
				temp.add(new ArrayList<Integer>(set));
			}
			
			for (ArrayList<Integer> set : temp) {
			   set.add(a[i]);	
			}
			
			
			ArrayList<Integer> single=new ArrayList<Integer>();
			single.add(a[i]);
			temp.add(single);
			
			result.addAll(temp);
			
		}
		
		result.add(new ArrayList<Integer>());
		return result;
	}
	
	public static void main(String[] args) {
	
		int[] a={1,2,3};
		ArrayList<ArrayList<Integer>> subsets=getSubsets(a);
		
		for (ArrayList<Integer> set : subsets) {
			System.out.print("[");
			for (Integer num : set) {
				System.out.print(num +" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
