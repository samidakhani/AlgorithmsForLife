package extras;

public class Swap_Numbers {

	public static void swap(int a, int b){
		
/*		b=(a+b-b)
		a=(a+b-a)*/
				
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a=" + a + " b=" + b);
	
	}
	
	public static void main(String[] args) {
		
		 swap(34, 56);

	}

}
