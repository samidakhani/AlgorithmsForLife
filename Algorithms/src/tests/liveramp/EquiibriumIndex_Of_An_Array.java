package tests.liveramp;

public class EquiibriumIndex_Of_An_Array {

	//https://codility.com/programmers/
	//Equilibrium Index Of an Array
	//Find an index in an array such that its prefix sum equals its suffix sum.
	public static  int solution(int[] A) {
     
		int currentIndex=0;
		int beforeSum=0;
		int afterSum=0;
		
		while(currentIndex < A.length){
			beforeSum=0;
			afterSum=0;
			for(int i=0;i<A.length;i++){
				
				if(i < currentIndex)
					beforeSum +=A[i];
					
				if(i > currentIndex)
					afterSum +=A[i];
					
			}
			
			if(beforeSum == afterSum)
				return currentIndex;
			
			currentIndex ++;
			
		}
		
		
		return -1;
	}
	public static void main(String[] args) {
		
		int[] a={0,1};
		//int[] a={-1,3,-4,5,1,-6,2,1}; 
        System.out.println(solution(a));
	}

}
