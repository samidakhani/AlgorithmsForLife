package medium;

public class Tic_Tac_Toe {

	public static char hasWon(char[][] board){
		
		char empty=' ';
		int N=board.length;
		int row=0;
		int col=0;
		
		//Check rows
		for(row=0;row<N;row++){
			if(board[row][0]!=empty){
				for(col=1;col<N;col++){
					if(board[row][col] != board[row][col-1]) break;
				}
				if(col==N) return board[row][0];
			}
		}
		
		//Check cols
		for (col=0;col < N;col++) {
			if(board[0][col]!=empty){
				for(row=1;row<N;row++){
					if(board[row][col] != board[row-1][col]) break;					
				}
				if(row==N) return board[0][col];
			}
		}
		
		//Check diagonal from top-left to bottom-right
	    if(board[0][0]!=empty){
	    	for(row=1;row<N;row++){
	    	 	if(board[row][row] != board[row-1][row-1]) break;
	    	}
	    	if(row==N) return board[0][0];
	    }
	    
	    //Check diagonal from bottom-left to top-right
	    if(board[N-1][0]!=empty){
	    	for(row=1;row<N;row++){
	    		if(board[N-row-1][row] != board[N-row][row-1]) break;
	    	}
	    	if(row==N) return board[N-1][0];
	    }
		
		return empty;
	}
	
	
	public static void main(String[] args) {

		char[][] board={{'x','o','o'},
				        {'o','x','o'},
				        {'o','x','o'}};
		
		System.out.println(hasWon(board));
	}

}
