package linkedlist;

import java.util.Stack;

public class Check_Palindrome {
	
	//using a stack
	public static boolean check_plain_stack(CharNode head){
		
		CharNode fast=head;
		CharNode slow=head;
		Stack<Character> stack=new Stack<Character>();
		
		while(fast!=null && fast.next !=null){
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		if(fast!=null){
			slow=slow.next;
		}
		
		while(slow!=null){
			int top=stack.pop().charValue();
			
			if(top != slow.data){
				return false;
			}
			
			slow=slow.next;
			
		}
		
		return true;
	} 
	
	
	//Reverse and Compare
	public static CharNode call_reverse(CharNode head){
		
		CharNode current=head;
		CharNode reverse=null;
		
		while(current !=null){
			CharNode temp= new CharNode(current.data);
	        temp.next=reverse;
	        reverse=temp;
	        current=current.next;
		}
		
		return reverse;
		
	}
	
	public static boolean checkpalin(CharNode head){
		
		CharNode reverse=call_reverse(head);
		
		CharNode first=head;
		CharNode second=reverse;
		
		while(first !=null){
			if (first.data != second.data) {
				return false;
			}
			first=first.next;
			second=second.next;
		}
		return true;
	}

	public static void main(String[] args) {
		CharNode head=new CharNode('n');
		head.appendToEnd('a');
		head.appendToEnd('y');
		head.appendToEnd('a');
		head.appendToEnd('n');
        System.out.println(check_plain_stack(head));
	}

}
