package maths;

public class Prime_Number {

	//Time Complexity O(sqrt(n))
	public static boolean isPrime(int n){
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
	
       if(isPrime(31))
    	   System.out.println("Prime");
       else
    	   System.out.println("Not a Prime");
	}

}
