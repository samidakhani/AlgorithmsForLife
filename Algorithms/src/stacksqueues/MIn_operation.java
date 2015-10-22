package stacksqueues;



public class MIn_operation {
	
	public static void main(String[] args){
		
		MinStack stack= new  MinStack();
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.push(3);
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
	}

}
