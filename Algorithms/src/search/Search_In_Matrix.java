package search;

public class Search_In_Matrix {

	public static void search(int[][] matrix,int elem){
		
		int row=0;
		int col=matrix[0].length-1;
		
		while(row <= matrix.length-1 && col >= 0){
			
			if(elem==matrix[row][col]){
				System.out.println("Found");
				return;
				}
		
			if(elem < matrix[row][col])
				 col--;
			else
				 row++;
			
		}
		System.out.println("Not found");
		
	}
	public static void main(String[] args) {
	
		 int[][] array={ {15,20,40,85},
				         {20,35,80,95},
				         {30,55,95,105},
				         {40,80,100,120} };
        search(array,56);
	}

}
