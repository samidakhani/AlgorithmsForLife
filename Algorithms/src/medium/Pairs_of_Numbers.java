package medium;

public class Pairs_of_Numbers {

	public static void findPairs(int[] a,int sum){
		
		int first=0;
		int last=a.length-1;
		
		while(first < last){
			
			int s=a[first]+a[last];
			
			if(s==sum){
				System.out.println(a[first] +" " + a[last]);
				first++;
				last--;
			}else if(s < sum){
				first++;
			}else{
				last--;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int sum=50;
		int[] a={10,20,30,40,50,60};
		findPairs(a, sum);

	}

}
