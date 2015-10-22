package stacksqueues;

public class MyStack {
	
	Node top;
	
	void push(int data){
		Node node=new Node(data);
		node.next=top;
		top=node;
	}
	
	int pop(){
		if(top!=null){
		int data=top.data;
		top=top.next;
		return data;
		}
		return 0;
	}
	
	int seek(){
	    return top.data;
	}

}
