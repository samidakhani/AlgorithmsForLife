package treesgraph;

public class DFS {
	
	public void search(GraphNode root){
		
		if(root==null) return;
		root.visit();
		root.visited=true;
		
		 for (GraphNode n : root.adjacent) {
			if(n.visited==false){
				search(n);
			 }
		   }
	}

}
