package treesgraph;


public class MinimalBST {

	public static TreeNode createMinimalBST(int[] array,int low,int high){
		
		if(low > high) return null;
		
		int mid=(low+high)/2;
		TreeNode node=new TreeNode(array[mid]);
		node.left=createMinimalBST(array,low, mid-1);
		node.right=createMinimalBST(array,mid+1,high);
		return node;
	}
	
	public static void main(String[] args) {

		int[] array={10,20,30,40,50,60,70,80};
	    TreeNode root=createMinimalBST(array,0,array.length-1);
	    Traversal.inOrder(root);
		
	}

}
