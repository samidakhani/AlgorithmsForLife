package medium;

public class Color_HIts {

	public static int MAX_COLORS=4;
	
	public static int code(char c){
		
		int index;
		
		switch (c) {
		case 'B':index=0;
		         break;
		case 'Y':index=1;
		         break;
		case 'G':index=2;
		         break;
		case 'R':index=3;
		         break;
		default:
			   index=-1;
		}
		return index;
		
	}
	
	public static void getHits(String guess,String solution){
		
	    if(guess.length() != solution.length()) return ;
		
	    int hits=0;
	    int pseudo_hits=0;
		int[] frequency_guess=new int[MAX_COLORS];
		int[] frequency_sol=new int[MAX_COLORS];
		
		
		for(int i=0;i < solution.length();i++){	
			if(solution.charAt(i)==guess.charAt(i)){
				hits++;
			}else{
				frequency_sol[code(solution.charAt(i))]++;
				frequency_guess[code(guess.charAt(i))]++;
			}	
		}
		
		for (int i = 0; i < frequency_sol.length; i++) {
		   pseudo_hits +=Math.min(frequency_sol[i],frequency_guess[i]);	
		}
		
		System.out.println("Hits: "+ hits);
		System.out.println("Pseudo hits: "+ pseudo_hits);
		
	}
	
	public static void main(String[] args) {
		
		 String guess="RGGR";
		 String solution="GGRR";
         getHits(guess, solution);
	}

}
