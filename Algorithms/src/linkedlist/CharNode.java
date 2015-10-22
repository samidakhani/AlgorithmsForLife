package linkedlist;

public class CharNode {
	char data;
	CharNode next=null;
	
	public CharNode(char d){
		data=d;
	}
	
	public void appendToEnd(char d){
		
		CharNode end=new CharNode(d);
		CharNode n=this;
		
		while(n.next !=null){
			n=n.next;
		}
		n.next=end;
	}
	
	public static void display(CharNode head){
		CharNode n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}			
	}
 }