package medium;

public class Swap_numbers {
	
	public static void swap(int a,int b){
		
		System.out.println("Before swap a=" +a);
		System.out.println("Before swap b=" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After swap a=" +a);
		System.out.println("After swap b=" +b);
	}
	
	public static void main(String[] args){
		
		swap(20,30);
	}

}
