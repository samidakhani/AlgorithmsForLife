package medium;

import java.util.HashSet;

public class Pairs_Of_Numbers_Unsorted {
	
	public static void findPairs(int[] arr, int sum){
		
		HashSet<Integer> hash=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(hash.contains(sum-arr[i])){
				System.out.println(arr[i] + " " + (sum-arr[i]));
			}
			
			hash.add(arr[i]);
		}
		
	}

	public static void main(String[] args) {

		int sum=12;
		int[]arr={6,7,8,9,1,16,2,3,14,13,4,5,12,32,44};
		findPairs(arr,sum);
	}

}
