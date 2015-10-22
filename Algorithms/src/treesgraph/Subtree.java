package treesgraph;

public class Subtree {
	// Time complexity is O(MN)
	public static boolean matchTree(TreeNode t1,TreeNode t2){
		
		if(t1== null && t2 == null)
			return true;
		
		if(t1 ==null || t2 == null)
			return false;
		
		if(t1.data != t2.data) 
			return false;
		
		return (matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right));
		
		
	}
	
	public static boolean subTree(TreeNode t1,TreeNode t2){
		
		if(t1 == null)
			return false;
		
		
		if(t1.data==t2.data)
			return matchTree(t1, t2);
		
		return (subTree(t1.left, t2) || subTree(t1.right, t2));
	}
	
	public static boolean containsTree(TreeNode t1,TreeNode t2){
		
		if(t2 == null)  return true;
		
		return subTree(t1, t2); 
	}
	
	public static TreeNode createSubTree(){
		
		TreeNode node3=new TreeNode(3);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		
		node3.left=node6;
		node3.right=node7;
		
		return node3;
	}
	
	public static void main(String[] args){
	  
		TreeNode t1=Traversal.createTree();
		TreeNode t2=createSubTree();
		System.out.println(containsTree(t1,t2));	
	}
}
