package search;


public class Rank_Of_Node {

	static TreeNode root = null;
	
	public static void insert(int d){
		
		if(root == null){
			root=new TreeNode(d);
		}else{
			root.insert(d);
		}
			
		
	}
	
	public static void main(String[] args) {
		
         insert(4);
         insert(2);
         insert(1);
         insert(3);
         insert(6);
         insert(5);
         insert(7);
         System.out.println(root.getRank(4));
	}

}
