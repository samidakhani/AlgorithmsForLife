package linkedlist;

public class Loop_Detection {

	public static Node find_begning(Node fast,Node slow){
		
		while(fast != slow){
			fast=fast.next;
			slow=slow.next;
		}
		
		return fast;
	
	}
	
	public static void loop_length(Node loop_head){
		
		Node currNode=loop_head.next;
		int counter=1;
		
		while(currNode !=loop_head){
			currNode= currNode.next;
			counter++;
		}
		
		System.out.println("Loop length = " + counter);
	}
	
	public static void detect_loop(Node head){
	
		Node fast=head;
		Node slow=head;
		boolean loop=false;
		
		while(fast!=null && fast.next != null){
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast == slow){
			  loop=true;
			  break;
			}
		}
		
		if(loop){
	 		System.out.println("Loop detected");
	        fast=head;
	        Node loop_head=find_begning(fast, slow);
	        System.out.println(loop_head.data);
		    loop_length(loop_head);	
		}
		else System.out.println("No Loop detected");
		
		
	}
	
	public static void main(String[] args) {
	
		Node head=new Node(10);
		head.appendToEnd(20);
		head.appendToEnd(30);
		head.appendToEnd(40);
		head.appendToEnd(50);
		head.appendToEnd(60);
		
		Node current=head;
		while(current.next != null){
			
			current= current.next;
		}
		
		current.next= head.next.next;
		
		detect_loop(head);
		
		

	}

}
