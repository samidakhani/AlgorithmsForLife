package linkedlist;

public class Sort_linked_list {
	
	 public static Node sort_lists(Node head, int value){
		 
		 Node current=head;
		 Node before=null;
		 Node after=null;
		 
		 Node beforestart=null;
		 Node afterstart=null;
		 
		 while(current != null){
         
		 Node temp= new Node(current.data);
			 
		 if(current.data < value){
				 
			if(before==null){
				before=temp;
				beforestart=before;
			}else{
				before.next=temp;
				before=before.next;
			}
				 	 
		 }else{
				 
				if(after==null){
					after=temp;
					afterstart=after;
				}else{
					after.next=temp;
					after=after.next;
				}	 
		 }
			
			 current=current.next;
		 }
		 
		 if(beforestart==null) return afterstart;
		 
		 before.next=afterstart;
		 return beforestart;
		 
	 }
	
	  public static void main(String[] args){
			Node head=new Node(50);
			head.appendToEnd(40);
			head.appendToEnd(30);
			head.appendToEnd(20);
			head.appendToEnd(60);
			head.appendToEnd(10);
			
		    Node sorted= sort_lists(head,20);
			Create_Linked_list.display(sorted);
		  }

}
