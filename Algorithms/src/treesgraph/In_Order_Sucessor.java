package treesgraph;

public class In_Order_Sucessor {
	
	public static TreeNode_Parent leftMostSucessor(TreeNode_Parent node){
		
		while(node.left != null){
			node=node.left;
		}
		return node;
	}
	
	public static TreeNode_Parent inOrderSucc(TreeNode_Parent node){
		
		if(node ==null) return null;
		
		if(node.right!=null){
			return leftMostSucessor(node.right);
		}
		
			TreeNode_Parent current=node;
			TreeNode_Parent parent=node.parent;
			
			while(parent!=null && parent.right == current){
				current=parent;
				parent=parent.parent;
			}
			
			return parent; 
		
	}
	

	
	public static void main(String[] args){
		
		TreeNode_Parent node1=new TreeNode_Parent(1);
		TreeNode_Parent node2=new TreeNode_Parent(2);
		TreeNode_Parent node3=new TreeNode_Parent(3);
		TreeNode_Parent node4=new TreeNode_Parent(4);
		TreeNode_Parent node5=new TreeNode_Parent(5);
		TreeNode_Parent node6=new TreeNode_Parent(6);
		TreeNode_Parent node7=new TreeNode_Parent(7);
		
		
		node1.left=node2;
		node1.right=node3;
		
		node2.parent=node1;
		node2.left=node4;
		node2.right=node5;
		
		node3.parent=node1;
		node3.left=node6;
		node3.right=node7;
		
		node4.parent=node2;
		node5.parent=node2;
		node6.parent=node3;
		node7.parent=node3;
		
		TreeNode_Parent inOrderSucessor=inOrderSucc(node6);
		System.out.println(inOrderSucessor.data);
		
	}

}
