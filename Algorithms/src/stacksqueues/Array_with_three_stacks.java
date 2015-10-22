package stacksqueues;

public class Array_with_three_stacks {

	static int stackSize=5;
	static int[] stack=new int[stackSize*3];
	static int[] stacktop={-1,-1,-1};
	
	public static void push(int stacknum,int value){
		
		if(stacktop[stacknum-1] < stackSize-1){
			stacktop[stacknum-1]++;
			
			int index=stacktop[stacknum-1] + ((stacknum-1) *stackSize);
			stack[index]=value;
		}
		else{
			System.out.println("Stack overflow, Stack no " + stacknum);
		}
		
	}
	
	public static int pop(int stacknum){
		
		if(stacktop[stacknum-1]== -1){
			System.out.println("Empty stack no " + stacknum);
			return 0;
		}
		
		int index=stacktop[stacknum-1] + ((stacknum-1) *stackSize);
		stacktop[stacknum-1]--;
		
		int temp=stack[index];
		stack[index]=0;
		return temp;
		
	}
	
	public static void display(){
		for(int i=0;i<stack.length;i++){
			System.out.println(stack[i]);
		}
		
	}
	public static void main(String[] args){
		
		push(1, 10);
		push(1, 20);
		push(1, 30);
		push(1, 40);
		push(1, 50);
		push(1, 60);
		
		push(3, 70);
		push(3, 80);
		pop(3);
		display();
		
	}
}
