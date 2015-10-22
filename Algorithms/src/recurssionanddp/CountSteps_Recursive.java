package recurssionanddp;

public class CountSteps_Recursive {

	//Time complexity O(3N)
	public static int countWays(int n){
		
		if(n < 0)return 0;
		if(n == 0) return 1;
		
		return countWays(n-1) + countWays(n-2) + countWays(n-3);
	}
	
	public static void main(String[] args) {
	
		System.out.println(countWays(36));
	}

}
