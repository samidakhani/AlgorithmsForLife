package stacksqueues;

public class TestStackQueue {

	public static void main(String[] args) {
		
/*		MyStack stack=new MyStack();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.seek());
		stack.pop();	
		System.out.println(stack.seek());*/
		
		MyQueue queue=new MyQueue();
		queue.enqueue(10);
        queue.enqueue(20);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
	}

}
