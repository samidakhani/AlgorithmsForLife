package treesgraph;

public class Traversal {

	public static  TreeNode createTree(){
		TreeNode node1=new TreeNode();
		TreeNode node2=new TreeNode();
		TreeNode node3=new TreeNode();
		TreeNode node4=new TreeNode();
		TreeNode node5=new TreeNode();
		TreeNode node6=new TreeNode();
		TreeNode node7=new TreeNode();
		
		node1.data=1;//5;
		node2.data=2;//3;
		node3.data=3;//8;
		node4.data=4;//2;
		node5.data=5;//4;
		node6.data=6;//7;
		node7.data=7;//9;
		
		node1.left=node2;
		node1.right=node3;
		
		node2.left=node4;
		node2.right=node5;
		
		node3.left=node6;
		node3.right=node7;
		
		return node1;
	}
	
	public static void preOrder(TreeNode root){
		//[1,2,4,5,3,6,7]
		if(root==null) return;
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
 	}
	
	public static void inOrder(TreeNode root){
		//[4,2,5,1,6,3,7]
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	public static void postOrder(TreeNode root){
		//[4,5,2,6,7,3,1]
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");		
	}
	
	
	public static void main(String[] args) {

		TreeNode root=createTree();
		preOrder(root);
		System.out.println("");
		inOrder(root);
		System.out.println("");
		postOrder(root);
	}

}
