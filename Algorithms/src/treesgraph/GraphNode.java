package treesgraph;

public class GraphNode {
    
	int data;
	boolean visited;
	GraphNode[] adjacent=null;
	
	
	public GraphNode(int adjacent_size){
		visited=false;
		adjacent=new GraphNode[adjacent_size];		
	}
	
	public void setAdjacent(int index,GraphNode node){
		this.adjacent[index]=node;
	}
	
	public void visit(){
		System.out.print(this.data +" ");
	}
	
	
}
