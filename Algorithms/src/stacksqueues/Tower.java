package stacksqueues;

import java.util.Stack;

public class Tower {

	Stack<Integer> disks=null;
	int index;
	
	public Tower(int index){
		disks=new Stack<Integer>();
		this.index=index;
	}
	
	public int index(){
		return index;
	}
	
	public void add(int item){
		
		if(!disks.isEmpty() && disks.peek() <= item){
		  System.out.println("Error inserting " + item +" disk");
		}else{
			disks.push(item);
		}
	}
	
	public void moveTopTo(Tower t){
		int item=disks.pop();
		t.add(item);
		System.out.println("Moving " + item + " from " + index() + " to " + t.index());
	}
	
	public void moveDisks(int n,Tower destination, Tower buffer){
		if(n>0){
			moveDisks(n-1,buffer,destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination,this);
		}
	}
	
	public static void main(String[] args){
		int n=3;
		Tower[] towers=new Tower[3];
		for(int i=0;i<3;i++){
			towers[i]=new Tower(i);
		}

		for (int i=n-1; i >= 0; i--) {
		    towers[0].add(i);	
		}
		
		towers[0].moveDisks(n, towers[2], towers[1]);
		
	}
}
