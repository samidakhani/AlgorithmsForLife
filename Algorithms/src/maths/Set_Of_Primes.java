package maths;

public class Set_Of_Primes {
	
    //Time Complexity O(n sqrt(n))
	public static void getPrimes(int max){
		
		for (int i = 2; i <= max; i++) {
		   if(Prime_Number.isPrime(i))
		      System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
      getPrimes(16);
	}

}
