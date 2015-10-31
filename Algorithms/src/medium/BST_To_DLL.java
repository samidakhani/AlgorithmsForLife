package medium;

public class BST_To_DLL {

	public static BiNode createBST(){
	
		BiNode node0=new BiNode(0);
		BiNode node1=new BiNode(1);
		BiNode node2=new BiNode(2);
		BiNode node3=new BiNode(3);
		BiNode node4=new BiNode(4);
		BiNode node5=new BiNode(5);
		BiNode node6=new BiNode(6);
		
		node4.node1=node2;
		node4.node2=node5;
		
		node2.node1=node1;
		node2.node2=node3;
		
		node1.node1=node0;
		
		node5.node2=node6;
		
		return node4;
		
	}
	  
	public static BiNode convert(BiNode root){
		  if(root==null) return null;
		  
		  BiNode part1=convert(root.node1);
		  BiNode part2=convert(root.node2);
		  
		  if(part1 !=null)
			  concat(getTail(part1),root);
		  
		  if(part2 != null)
			  concat(root, part2);
		  
		  
		  return part1==null?root:part1;
	  }
	  
	  public static void concat(BiNode x,BiNode y){
		  x.node2=y;
		  y.node1=x;
	  }
	  
	  public static BiNode getTail(BiNode node){
		  if(node == null) return null;
		  
		  while(node.node2 !=null){
			  node=node.node2;
		  }
		  
		  return node;
	  }
	public static void main(String[] args) {
	
		BiNode root=createBST();
        BiNode head=convert(root);
        
        while(head!=null){
        	System.out.println(head.data);
        	head=head.node2;
        }
		
	}

}
