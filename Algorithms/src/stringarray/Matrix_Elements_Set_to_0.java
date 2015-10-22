package stringarray;

public class Matrix_Elements_Set_to_0 {


	
	
	public static void main(String[] args) {
		
		int[][] matrix={{1,2,3,4},
				 {1,2,3,0},
				 {1,2,3,4},
				 {1,2,3,4}};
		
		boolean[] rows_check=new boolean[matrix.length];
		boolean[] cols_check=new boolean[matrix[0].length];
		
		for (int i = 0; i < rows_check.length; i++) {
			for (int j = 0; j < cols_check.length; j++) {
				if (matrix[i][j]==0) {
					rows_check[i]=true;
					cols_check[j]=true;
				}
			}
		}
		
		for (int i = 0; i < rows_check.length; i++) {
			if (rows_check[i]) {
				for (int j = 0; j < cols_check.length; j++) {
					matrix[i][j]=0;
				}
			}
		}
		
		for (int j = 0; j < cols_check.length; j++) {
			if (cols_check[j]) {
				for (int i = 0; i < rows_check.length; i++) {
					matrix[i][j]=0;
				}
			}
		}
		
		System.out.println(matrix);

	}

}
