package treesgraph;

public class TreeHeight {

	public static int checkHeight(TreeNode root){
		
		if(root == null) return 0;
		
		int leftHeight=checkHeight(root.left);
	    int rightHeight=checkHeight(root.right);
		
	    return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public static void main(String[] args) {
		
		TreeNode root=Traversal.createTree();
        System.out.println("Height = " + checkHeight(root) ); 

	}

}
