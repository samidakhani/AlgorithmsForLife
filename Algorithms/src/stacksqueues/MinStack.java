package stacksqueues;
import java.util.Stack;;

public class MinStack {
	
	Node top;
	
	Stack<Integer> minimum=new Stack<Integer>();
	
	
	public void push(int value){

		if(minimum.isEmpty()) minimum.push(Integer.MAX_VALUE);
       		
		Node temp=new Node(value);
		temp.next=top;
		top=temp;
		
		if(value <= minimum.peek()) minimum.push(value);
		
	}
	
	public int pop(){
		
		if(top !=null){
		     int value=top.data;
		     top=top.next;
		     
		     if(value== minimum.peek()) minimum.pop();
		     
		     return value;
		     
		}
		
		return -1;
	}

	public int min(){
		
		if(top !=null){
			return minimum.peek();
		}
		return 0;
	}
}
