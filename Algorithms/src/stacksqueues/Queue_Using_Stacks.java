package stacksqueues;

import java.util.Stack;

public class Queue_Using_Stacks {


	public static void main(String[] args) {

		Queue_Stacked queue=new Queue_Stacked();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
