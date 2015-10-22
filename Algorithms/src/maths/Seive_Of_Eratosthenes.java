package maths;

public class Seive_Of_Eratosthenes {
    //O(N log(log N))
	public static void init(boolean[] primes){
		
		for (int i = 0; i < primes.length; i++) {
			primes[i]=true;
		}
		
		primes[0]=primes[1]=false;
	}
	
	public static boolean[] getPrimes(int max){
		
		boolean[] flags=new boolean[max+1];
		init(flags);
		
		int prime=2;
		
		while(prime <= Math.sqrt(max)){
			
			setFlags(flags, prime);
			
			prime=getNextPrime(flags, prime);
			
			if(prime == -1) break;
		}
		
		return flags;
	}
	
	public static void setFlags(boolean[] flags,int prime){
		
		for(int i=prime*prime;i<flags.length; i+=prime){
			flags[i]=false;
		}
	}
	
	public static int getNextPrime(boolean[] flags,int prime){
		
		int next=-1;
		
		for (int i = prime+1; i < flags.length; i++) {
			if(flags[i]){
				next=i;
				break;
			}
		}
		
		return next;
	}
	
	public static void main(String[] args) {
	
	 System.out.println("Primes are ");
     boolean[] priimes=getPrimes(20);
     for (int i = 1; i < priimes.length; i++) {
    	 if(priimes[i])
		    System.out.print(" " + i);
	 }
	
	}

}
