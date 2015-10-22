package treesgraph;

public class Path_In_Directed_Graph {
	
	public static void searchPath(GraphNode root,GraphNode start,GraphNode end){
		
		Queue queue=new Queue();
		start.visited=true;
		queue.enqueue(start);
		
		while(!queue.isEmpty()){
			GraphNode r=queue.dequeue();
			for (GraphNode n:r.adjacent) {
				if(n.visited==false){
				
					if(n == end){
						System.out.println("Path found");
						return;
					}
					n.visited=true;
					queue.enqueue(n);
					
				}
			}
		}
		
		System.out.println("No path found");
		
	}

	public static void main(String[] args) {
       
		GraphNode node1= new GraphNode(2);
		GraphNode node2= new GraphNode(2);
		GraphNode node3= new GraphNode(4);
		GraphNode node4= new GraphNode(0);
		GraphNode node5= new GraphNode(0);
		GraphNode node6= new GraphNode(0);
		GraphNode node7= new GraphNode(0);
		GraphNode node8= new GraphNode(0);
		
		node1.data=1;
		node2.data=2;
		node3.data=3;
		node4.data=4;
		node5.data=5;
		node6.data=6;
		node7.data=7;
		node8.data=8;
		
		node1.setAdjacent(0, node2);
		node1.setAdjacent(1, node3);
		
		node2.setAdjacent(0, node4);
		node2.setAdjacent(1, node5);
		
		node3.setAdjacent(0, node5);
		node3.setAdjacent(1, node6);
		node3.setAdjacent(2, node7);
		node3.setAdjacent(3, node8);
		
		searchPath(node1,node6, node5);
	}

}
