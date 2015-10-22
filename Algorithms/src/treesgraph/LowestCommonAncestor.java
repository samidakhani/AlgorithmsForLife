package treesgraph;

//https://www.youtube.com/watch?v=NBcqBddFbZw 
public class LowestCommonAncestor {
	
	public static TreeNode findLCA(TreeNode root, TreeNode x, TreeNode y){
		
		if(root == null)
			return null;
		
		if(root == x || root == y)
			return root;
		
		TreeNode left=findLCA(root.left, x, y);
		TreeNode right=findLCA(root.right, x, y);
		
		if(left != null && right != null)
			return root;
		
		if(left == null)
			return right;
		else
			return left;
		
	}
	
	
	public static void main(String[] args){
		
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		
		node1.left=node2;
		node1.right=node3;
		
		node2.left=node4;
		node2.right=node5;
		
		node3.left=node6;
		node3.right=node7;
		
		TreeNode lca=findLCA(node1,node3,node7);
		System.out.println(lca.data);
		
		
	}
   
}
