package treesgraph;


public class BFS {
	
	public void search(GraphNode root){
    
		Queue queue=new Queue();
		root.visit();
		root.visited=true;
		queue.enqueue(root);

		while(!queue.isEmpty()){
			GraphNode r=queue.dequeue();
			for (GraphNode n:r.adjacent) {
				if(n.visited==false){
					n.visit();
					n.visited=true;
					queue.enqueue(n);
				}
			}
		}
	}
}
