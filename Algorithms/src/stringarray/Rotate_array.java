package stringarray;

public class Rotate_array {
	
	public static void main(String[] args) {
		
		int[][] matrix={{1,2,3,4},
				 {1,2,3,4},
				 {1,2,3,4},
				 {1,2,3,4}};
		
		int n=matrix.length;
       //rotate right
		int[][] r_rotate= new int[n][n]; 
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				r_rotate[i][j]=matrix[n-j-1][i];
			}
		}
		
	  //rotate left
		int[][] l_rotate= new int[n][n]; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				l_rotate[i][j]=matrix[j][n-i-1];
			}
		}
	}
}
