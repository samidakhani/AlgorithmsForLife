package extras;

import java.util.HashSet;

//Time complexity O(N)
//Space Complexity O(N)
public class Paris_Of_Numbers_Unsorted {

	public static void getPairsOfSum(int[] arr, int sum){
		
		HashSet<Integer> hash=new HashSet<Integer>();
		
		for(int num:arr){
			if(hash.contains(sum-num))
				System.out.println(num + " " + (sum-num));
			hash.add(num);
		}
		
	}
	
	public static void main(String[] args) {
	
		int sum=12;
		int[]arr={6,7,8,9,1,16,2,3,14,13,4,5,12,32,44};
        getPairsOfSum(arr,sum);
	}

}
