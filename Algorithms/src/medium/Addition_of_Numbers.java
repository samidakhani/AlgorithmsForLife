package medium;

public class Addition_of_Numbers {

	public static int add(int a,int b){
		if(b==0) return a;
		
		int sum=a^b;
		int carry=(a&b)<<1;
		
		return add(sum,carry);
	}
	
	public static void main(String[] args) {

      System.out.println(add(20,30));
	}

}
