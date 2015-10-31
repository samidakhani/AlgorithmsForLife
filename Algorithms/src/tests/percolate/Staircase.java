package tests.percolate;

public class Staircase {

	public static void main(String[] args) {
		
		 int N=20;
		    
		    for(int i=1;i<=N;i++){
		        
		        for(int j=1;j<=N-i;j++){        
		            System.out.print(" ");
		        }
		        
		        for(int j=N-i+1;j<=N;j++){
		         System.out.print("#");   
		        }
		        
		        System.out.println();
		        
		    }
	}

}
