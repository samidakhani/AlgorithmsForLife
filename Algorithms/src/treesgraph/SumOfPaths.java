	package treesgraph;

public class SumOfPaths {
	//Time complexity - O(N log N)
	
	public static void findPath(TreeNode root,int sum,int[] path,int level){
	
		if(root == null) return;
		
		path[level]=root.data;
		
		int t=0;
		for(int i=level;i>=0;i--){
			t +=path[i];
			
			if(t == sum)
				print(path,i,level);
		}
		
		findPath(root.left, sum, path, level+1);
		findPath(root.right, sum, path, level+1);
		
	}
	
	public static void findPath(TreeNode root,int sum){
		
		int height=findHeight(root);
		int[] path=new int[height];
		findPath(root,sum,path,0);
	}
	
	public static void print(int[] path,int start,int end){
		for(int i=start;i<=end;i++){
			System.out.print(path[i] + " ");
		}
		System.out.println(" ");
	}
	
	public static int findHeight(TreeNode root){
		if(root == null)
			return 0;
		
		int leftHeight=findHeight(root.left);
		int rightHeight=findHeight(root.right);
		
		return Math.max(leftHeight,rightHeight) + 1;
	}
	
	public static void main(String[] args){
		TreeNode root=Traversal.createTree();
		findPath(root,7);
		
	}

}
