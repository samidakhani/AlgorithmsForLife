package treesgraph;

public class BalancedTree {

	//Time Complexity O(N)
	//Space complexity O(H) -- Height of tree
	public static int checkHeight(TreeNode root){
		if(root == null) return 0;
		
		int leftHeight=checkHeight(root.left);
		if(leftHeight == -1)
			 return -1;
			
		int rightHeight=checkHeight(root.right);
		if(rightHeight == -1)
			return -1;
		
		int heightDiff=leftHeight-rightHeight;
		
		if(Math.abs(heightDiff) > 1){
			return -1;
		}
		
		return Math.max(leftHeight, rightHeight) + 1;
		
	}
	
	public static  void isBalanced(TreeNode root){
		
		if(checkHeight(root)==-1){
			System.out.println("Not balanced");
		}else{
			System.out.println("Balanced");
		}
		
	}
	
	public static void main(String[] args) {
		
		TreeNode root=Traversal.createTree();
        isBalanced(root);  
	}

}
