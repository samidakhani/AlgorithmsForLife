package search;

public class TreeNode {
	int data;
	TreeNode left=null;
	TreeNode right=null;
	int leftSize=0;
	
	public TreeNode() {}
	
	public TreeNode(int data) {
		this.data=data;
	}
	
	
	public void insert(int d){
		if(d <= data){
			leftSize++;
			if(left !=null)  
				left.insert(d);
			else 
				left=new TreeNode(d);
			
		}else{
			if(right !=null) 
				right.insert(d);
			else 
				right=new TreeNode(d);
		}
	}
	
	public int getRank(int d){
		
		if(d == data){
			return leftSize;
		}else if(d < data){
			if (left == null)
				return -1;
			else
				return left.getRank(d);
		}else{
			int right_rank = right == null ? -1 : right.getRank(d);
			if(right_rank == -1) return -1;
			else return leftSize + 1 + right_rank;
		}
		
	}
	

}
