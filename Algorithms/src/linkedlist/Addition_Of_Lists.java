package linkedlist;

public class Addition_Of_Lists {

	public static Node reverse(Node head){
		
		Node curNode=head;
		Node reverse=null;
		
		while(curNode != null){
			Node temp=new Node(curNode.data);
			temp.next=reverse;
			reverse=temp;
			curNode=curNode.next;
		}
		return reverse;
	}
	
	public static Node add(Node l1,Node l2){
		
		Node sum_list=null;
		Node sum_list_start=null;
		int sum=0,data=0,carry=0;
		
		while(l1 !=null && l2!=null){
			
			data=l1.data + l2.data +carry;
			carry=0;
			sum=data%10;
			carry=data/10;
			Node temp= new Node(sum);
			
			if(sum_list==null){
				sum_list=temp;
				sum_list_start=sum_list;
			}else{
				sum_list.next=temp;
				sum_list=temp;
			}
			
			l1=l1.next;
			l2=l2.next;
		}
		
		while(l1 !=null){
			
			data=l1.data+carry;
			carry=0;
			sum=data%10;
			carry=data/10;
			Node temp= new Node(sum);
			sum_list.next=temp;
			sum_list=temp;
			
			l1=l1.next;
		}
		
		while(l2 !=null){
			data=l2.data+carry;
			carry=0;
			sum=data%10;
			carry=data/10;
			Node temp= new Node(sum);
			sum_list.next=temp;
			sum_list=temp;
			
			l2=l2.next;
		}
		
		if(carry !=0){
			Node temp= new Node(carry);
			sum_list.next=temp;
			sum_list=temp;
		}
		
		return sum_list_start;
		
	}
	public static void main(String[] args) {
	
		Node l1=new Node(6);
		l1.appendToEnd(2);
		l1.appendToEnd(7);
		l1.appendToEnd(1);
		
		Node l2=new Node(3);
		l2.appendToEnd(9);
		l2.appendToEnd(5);
		
		l1=reverse(l1);
		l2=reverse(l2);
		
		Node sum=add(l1, l2);
		sum=reverse(sum);
		Create_Linked_list.display(sum);
	
	}

}
