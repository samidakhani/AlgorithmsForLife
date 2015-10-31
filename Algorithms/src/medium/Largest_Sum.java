package medium;

public class Largest_Sum {

	public static int largest_sum(int[] a){
		int maxsum=0;
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
			if(maxsum < sum) maxsum=sum;
			if(sum < 0) sum=0;
		}
		
		return maxsum;
	}
	
	public static void main(String[] args) {

		int[] a={2,3,-8,-1,2,4,-2,3};
		System.out.println(largest_sum(a));
	}

}
