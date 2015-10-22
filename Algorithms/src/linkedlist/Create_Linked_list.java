package linkedlist;

public class Create_Linked_list {
	
	public static void display(Node head){
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}			
	}
	
	public static Node delete(Node head ,int d){
	 	
		Node n=head;
		
		if(head.data==d)
			return head.next;
		
		while(n.next != null){
			if(n.next.data==d){
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
			
		return head;
	}
	
	public static void main(String[] args){
		Node head=new Node(10);
		head.appendToEnd(20);
		head.appendToEnd(30);
		head.appendToEnd(40);
		head.appendToEnd(50);
		
		display(head);
		
		delete(head,30);
		
		display(head);
	}
	

}
