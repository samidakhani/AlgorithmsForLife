package linkedlist;

public class Kth_Last_Element {
   //Time complexity O(n)
   //Space complexity o(1)
  public static Node find_element(Node head,int K_pos){
	  
	  if(K_pos<= 0) return null;
	  
	  Node fast=head;
	  Node second=head;
	  
	  int current=1;
	  
	  while(current < K_pos){
		  if(fast == null) return null;
		  fast=fast.next;
		  current++;
	  }
	  
	  if(fast == null) return null;
	  
	  while(fast != null && fast.next != null){
		  fast=fast.next;
		  second=second.next;
	  }
	  
	  
	  
	  return second;
	  
  }
  public static void main(String[] args){
	Node head=new Node(10);
	head.appendToEnd(20);
	head.appendToEnd(30);
	head.appendToEnd(40);
	head.appendToEnd(50);
	
	Node kth_element=find_element(head,0);
	System.out.println(kth_element.data);
  }
}
