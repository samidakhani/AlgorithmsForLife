package treesgraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_For_Each_Level {

	public static ArrayList<LinkedList<TreeNode>>  createLinkedLists(TreeNode root){
		
		ArrayList<LinkedList<TreeNode>> lists=new ArrayList<LinkedList<TreeNode>>();
		
		LinkedList<TreeNode> current=new LinkedList<TreeNode>();
		if(root != null){
			current.add(root);
		}
		
		while(current.size()!= 0){
			lists.add(current);
			
			LinkedList<TreeNode> parents=current;
			current=new LinkedList<TreeNode>();
			
			for (TreeNode parent : parents) {
				
				if (parent.left !=null) {
					current.add(parent.left);
				}
				
				if(parent.right !=null){
					current.add(parent.right);
				}
			}
		}
		
		
		return lists;
	}
	
	
	public static void main(String[] args) {
	
		TreeNode root=Traversal.createTree();
		ArrayList<LinkedList<TreeNode>> lists=createLinkedLists(root);

	}

}
