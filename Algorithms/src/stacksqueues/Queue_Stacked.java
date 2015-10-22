package stacksqueues;

import java.util.Stack;

public class Queue_Stacked {

	static  Stack<Integer> stackNew = new Stack<Integer>();
	static  Stack<Integer> stackOld = new Stack<Integer>();
	
	public void enqueue(int value){
		
		if(stackNew.isEmpty()){
			while(!stackOld.isEmpty()){
				stackNew.push(stackOld.pop());
			}
		}
		
		stackNew.push(value);
	}
	
	public int dequeue(){
		
		if (stackNew.isEmpty() && stackOld.isEmpty()) {
			return -1;
		}
		
		if(stackOld.isEmpty()){
			while(!stackNew.isEmpty()){
				stackOld.push(stackNew.pop());
			}
		}
		
		return stackOld.pop();
		
	}
	
}
