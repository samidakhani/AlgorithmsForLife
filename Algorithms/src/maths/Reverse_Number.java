package maths;

public class Reverse_Number {

	public static int reverse(int n){
		
		int reverse=0;
		
		while(n != 0){
		   	int temp=n%10;
		   	n=n/10;
		   	reverse=(reverse*10)+temp;
		}
		
		return reverse;
		
	}
	
	public static void main(String[] args) {
		
		int n=202;
		n=reverse(n);
		System.out.println(n);

	}

}
