package recurssionanddp;

import java.util.Stack;

public class Check_Paranthesis {

	public static boolean check(String str){
		
		Stack<Character> stack=new Stack<Character>();
		char[] paranthesis=str.toCharArray();
		
		for(int i=0;i<paranthesis.length;i++){
			if(paranthesis[i]=='('){
			   stack.push(paranthesis[i]);
			}else if(paranthesis[i]==')'){
				if(stack.isEmpty()){
					return false;
				}
				stack.pop();
			}
			
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
		
		
	}
	
	public static void main(String[] args) {
		
		String str="";
		
		System.out.println(check(str));

	}

}
