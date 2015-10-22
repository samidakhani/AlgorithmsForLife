package linkedlist;

import java.util.ArrayList;

public class RemoveDuplicates {
   //Time complexity O(N)
	public static void remove_dups(Node head){
	
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		Node n=head;
		Node previous=null;
		
		while(n != null){
			
			if(array.contains(n.data)){
				previous.next=n.next;
			}else{
				array.add(n.data);
			}
			previous=n;
			n=n.next;
		}	
	}
	
	
	public static void main(String[] args){
		
		Node head=new Node(10);
		head.appendToEnd(20);
		head.appendToEnd(30);
		head.appendToEnd(20);
		head.appendToEnd(40);
		
		remove_dups(head);
		
		Create_Linked_list.display(head);
	}
}
