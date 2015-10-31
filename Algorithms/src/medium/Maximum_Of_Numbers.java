package medium;

public class Maximum_Of_Numbers {

	public static int flip(int bit){
		return (1^bit);
	}
	
	public static int sign(int num){
		return flip((num >> 31) & 1);
	}
	
	public static int getMaxNaive(int a,int b){
		int k=sign(a-b);
		int q=flip(k);
		return a*k+b*q;
	}
	
	public static int getMax(int a,int b){
		
		int c=a-b;
		int sa=sign(a);
		int sb=sign(b);
		int sc=sign(c);
		
		int use_sign_a=(sa^sb);
		int use_sign_c=flip(use_sign_a);
		
		int k=use_sign_a * sa + use_sign_c *sc;
		int q=flip(k);
		return a*k+b*q;
	}
	
	public static void main(String[] args){

		System.out.println(getMax(Integer.MAX_VALUE,-10));
	}
}
