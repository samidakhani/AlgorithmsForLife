package treesgraph;

public class GraphTraversal {
	
	public static GraphNode createGraph(){
		
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
		
		return node1;
	}

	public static void main(String[] args) {

		GraphNode root=createGraph();
		
/*		DFS dfs=new DFS();
		dfs.search(root);
		
		System.out.println(" ");*/
		
		BFS bfs=new BFS();
		bfs.search(root);
	}

}
