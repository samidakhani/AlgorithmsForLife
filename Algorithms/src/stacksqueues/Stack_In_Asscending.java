package stacksqueues;
import java.util.Stack;

public class Stack_In_Asscending {
    //Time complexity O(n2)
	//Space complexity O(n)
	static  Stack<Integer> unsorted = new Stack<Integer>();
	static  Stack<Integer> sorted = new Stack<Integer>();
	
	public static void main(String[] args) {

		unsorted.push(10);
		unsorted.push(5);
		unsorted.push(12);
		unsorted.push(8);
		unsorted.push(3);
		while(!unsorted.isEmpty()){
			
			int temp=unsorted.pop();
			
			if(sorted.isEmpty()) sorted.push(temp);
			else{
				if(temp >= sorted.peek()) sorted.push(temp);
				else{
					while(!sorted.isEmpty()){
					unsorted.push(sorted.pop());
					}
					sorted.push(temp);
				}
			}
		}
		
	System.out.println(sorted.toString());
	}
}
