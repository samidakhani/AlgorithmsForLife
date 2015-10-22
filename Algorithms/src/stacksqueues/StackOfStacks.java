package stacksqueues;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfStacks {

	ArrayList<Stack<Integer>> stacks= new ArrayList<Stack<Integer>>();
	int stackSize=2;
	
	public void push(int value){
		Stack<Integer> stack=getCurrentStack();	
		
		if(stack.size()== stackSize){
			stack= new Stack<Integer>();
			stacks.add(stack);
		}
		
		stack.push(value);
	}
	
	public int pop(){
		
		if(stacks.isEmpty()) return -1;
		
		Stack<Integer> stack=getCurrentStack();
		int value=stack.pop();
		if(stack.size()==0) stacks.remove(stacks.size()-1);
		return value;
	}
	
	public Stack<Integer> getCurrentStack(){
		
		if(stacks.isEmpty()){
			Stack<Integer> stack= new Stack<Integer>();
			stacks.add(stack);
			return stack;
		}
		
		return stacks.get(stacks.size()-1);
	}
	
	public static void main(String[] args){
		StackOfStacks stacks_of_stacks=new StackOfStacks();
		
		stacks_of_stacks.push(10);
		stacks_of_stacks.push(20);
		stacks_of_stacks.push(30);
		stacks_of_stacks.push(40);
		
		System.out.println(stacks_of_stacks.pop());
		System.out.println(stacks_of_stacks.pop());
		System.out.println(stacks_of_stacks.pop());
		System.out.println(stacks_of_stacks.pop());
		System.out.println(stacks_of_stacks.pop());
	}
	
	
}
