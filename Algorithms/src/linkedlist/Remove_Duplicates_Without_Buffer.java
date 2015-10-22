package linkedlist;

public class Remove_Duplicates_Without_Buffer {
	//Time complexity O(N2)
	//Space Complexity O(1)
  public static void remove_dups(Node head){

	  Node first=head;
	 
	  while(first!=null && first.next !=null ){
		  
		  Node second=first.next;
		  Node previous=first;
		  while(second !=null){
			  if(first.data==second.data){
				  previous.next=second.next;
			  }
			  previous=second;
			  second=second.next;
		  }
		  
		  first=first.next;
	  }
  }
  
	public static void main(String[] args){
		
		Node head=new Node(10);
		head.appendToEnd(20);
		head.appendToEnd(40);
		head.appendToEnd(20);
		head.appendToEnd(40);
		head.appendToEnd(40);
		head.appendToEnd(40);
		
		remove_dups(head);
		
		Create_Linked_list.display(head);
	}

}
