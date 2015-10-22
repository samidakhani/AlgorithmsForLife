package recurssionanddp;

public class Fibonacii {
    //Time Complexity O(2N)
	public static int fibonacii(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonacii(n-1) + fibonacii(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibonacii(10));
		
	}

}
