package recurssionanddp;

public class CountSteps_Dynamic {

	//Time complexity O(N)
	public static int countWays(int n,int[] max){
		
		if(n < 0)return 0;
		if(n == 0) return 1;
		
		if(max[n] != 0) return max[n];
		
		max[n]=countWays(n-1,max) + countWays(n-2,max) + countWays(n-3,max);
		return max[n];
	}
	
	public static void main(String[] args) {
		
		int n=36;
		int[] max=new int[n+1];
		System.out.println(countWays(n,max));
	}

}
