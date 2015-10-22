package tests.liveramp;

import java.util.HashSet;

public class Frog_Pond_Problem {
	
	 public static int solution(int[] A, int X, int D) {
	       
	       //When frog can cross the pond without a leaf
	       if(X <= D)
	         return 0;
	         
	       if(A.length ==0) return -1;
	         
	       //When frog can jump to the other end at 0th second    
	      // if(A[0] <=D && (X-A[0]) <= D)
	       //     return 0;
	    
	       boolean lastJumpSet=false;
	       int lastJumpTime=-1;
	       
	       //Contains value to index mapping
	       HashSet<Integer> hash=new HashSet<Integer>();
	     
	       while(X > D){
	       
	         int maxJump=0;
	         int maxIndex=-1;
	         
	         for(int i=0;i<A.length;i++){
	            
	            if(!hash.contains(A[i])){
	            
	               int tempJump=X-A[i];
	               
	               if(tempJump > maxJump && tempJump <= D){
	                    maxJump=tempJump;
	                    maxIndex=i;
	                }
	               
	             }
	         
	         }
	       
	         //Exit if no leaf was found where a valid jump can be performaed  
	         if(maxIndex == -1)
	            return -1;
	          
	         if(!lastJumpSet){
	            lastJumpTime=maxIndex; 
	            lastJumpSet=true;
	         }
	         
	         //retain the leaf position at which jump is made
	         hash.add(A[maxIndex]);
	         
	         //substract the no of setps jumped[Give us the remaining no of steps]
	         X=X-maxJump;
	           
	        }
	        
	        return lastJumpTime;
	       
	    }
	
	public static void main(String[] args) {
		
		int[] a={3,1,2,1};
		//int[] a={1,3,1,4,2,5};
		int X=2;
		int D=3;
        System.out.println(solution(a,X,D));

	}

}

