package treesgraph;

import java.util.ArrayList;

public class Queue {
	
	ArrayList<GraphNode> queue=null;
	
	    public Queue(){
	    	queue=new ArrayList<GraphNode>();
	    }
	    
	    public void enqueue(GraphNode node){
	    	queue.add(node);
	    }
	    
	    public GraphNode dequeue(){
	    	 return queue.remove(0);
	    }

	    public boolean isEmpty(){
	    	
	    	if(queue.isEmpty()) return true;
	    	return false;
	    }
}
