package treesgraph;

public class CheckBST {

	public static boolean checkBST(TreeNode root){
		
		if(root == null) return true;
		
		if( (root.left!=null && root.left.data > root.data)
				|| ( root.right!=null && root.right.data <= root.data)) 
		    return false;
		
		if(!checkBST(root.left))
			return false;
		
		if(!checkBST(root.right))
			return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
         TreeNode root= Traversal.createTree();
         boolean check=checkBST(root);
         if(check) System.out.println("BST");
         else System.out.println("Not a BST");
	}

}
