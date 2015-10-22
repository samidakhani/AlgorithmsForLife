package extras;

//Time Complexity O(N log N)
public class Pairs_Of_Numbers_Sum {

	public static void getPairsOfSum(int[] a, int sum){
		
		int i=0;
		int j=a.length-1;
		
		while(i < j){
			if((a[i]+a[j]) == sum){
				System.out.println(a[i] + " " +a[j]);
			    break;
			}
			if((a[i]+a[j]) < sum)
				i++;
			if((a[i]+a[j]) > sum)
				j--;
		}
	}
	
	public static void main(String[] args) {
	
		int sum=50;
		int[] a={10,20,30,40,50,60};
        getPairsOfSum(a, sum);
        
	}

}
