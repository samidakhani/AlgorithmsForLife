package maths;

public class Maths_Operations {

	public static int negate(int a){
		
		int neg=0;
		int d= a<0 ? 1: -1;
		
		while(a!=0){
			neg=neg+d;
			a=a+d;
		}
		
		return neg;
	}
	
	public static int substract(int a, int b){
		return a + negate(b);
	}
	
	public static int abs(int a){
	     if(a < 0)
	    	 return negate(a);
	     else
	    	 return a;
	}
	
	public static int multiplication(int a,int b){
		
		if(a < b)
			return multiplication(b, a);
		
		int sum=0;
		for(int i=abs(b);i > 0;i--){
			sum=sum + a;
		}
		
		if(b < 0)
			return negate(sum);
		else
			return sum;
	}
	
	public static int divide(int a,int b) throws Exception{
	    
		if(b==0) throw new java.lang.ArithmeticException(); 
			
		int absa=abs(a);
		int absb=abs(b);
		
		int x=0;
		int product=0;
		
		while(product+absb <=absa){
			product = product + absb;
			x++;
		}
		
		if((a < 0 && b < 0) || (a > 0 && b > 0))
			return x;
		else
			return negate(x);
	}
	
	public static void main(String[] args) throws Exception {
	   
		int a=12;
		int b=10;
		int product=divide(a, b);
		System.out.println(product);
	} 

}
