package linkedlist;

public class Delete_Node_In_Middle_Of_linkedList {

	public static void middle_delete(Node node){	
		Node next=node.next;
		node.data=next.data;
		node.next=next.next;
	}
	
	public static void main(String[] args){
	
		Node head=new Node(10);
		head.appendToEnd(20);
		head.appendToEnd(30);
		head.appendToEnd(40);
		head.appendToEnd(50);
		
		Node check=head.next.next.next;
	    middle_delete(check);
		
		Create_Linked_list.display(head);
	}
}
