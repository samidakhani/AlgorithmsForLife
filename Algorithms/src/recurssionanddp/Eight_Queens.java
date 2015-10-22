package recurssionanddp;

import java.util.ArrayList;

public class Eight_Queens {

	public static boolean checkValid(Integer[] columns,int row1,int col1){
		for (int row2 = 0; row2 < row1; row2++) {
			
			int col2=columns[row2];
			if(col1==col2) return false;
			
			int colDiff=Math.abs(col1-col2);
			int rowDiff=row1-row2;
			
			if(colDiff==rowDiff) return false;
				
		}
		return true;
	}
	
	public static void placeQueens(int row,Integer[] columns,ArrayList<Integer[]> result){
		
		int GRID_SIZE=8;
		
		if(row==GRID_SIZE){
			result.add(columns.clone());
		}else{
			
		  for(int col=0;col < GRID_SIZE; col++){
			
			  if(checkValid(columns, row, col)){
				  columns[row]=col;
				  placeQueens(row+1, columns, result);
			  }
		  }
		  
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] columns=new Integer[8];
		ArrayList<Integer[]> result=new ArrayList<Integer[]>();
	    placeQueens(0, columns, result);
	    
      
	    for (Integer[] cols : result) {
			System.out.println();
	    	for (Integer i : cols) {
				System.out.print(i + " ");
			}
		}

	}

}
