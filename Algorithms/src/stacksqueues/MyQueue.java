package stacksqueues;

public class MyQueue {
	
	Node first=null;
	Node last=null;
	
	public void enqueue(int data){
		Node node=new Node(data);
		if(first==null){
		 last=node;
		 first=last;
		}else{
		 last.next=node;
		 last=node;
		}
		
	}
	
	public int dequeue(){
		if(first!=null){
			int data=first.data;
			first=first.next;
			if(first==null) last=null;
			return data;
		}
		return 0;
	}
	

}
