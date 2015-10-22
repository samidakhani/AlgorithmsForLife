package maths;

public class Gcd_Numbers {

	//lcm= x * y /gcd(x,y)
			
	public static int gcd(int a,int b){
		if(b==0)
		   return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		
		int gcd=gcd(60,40);
		if(gcd < 0){
			gcd= gcd * -1;
		}
		System.out.println("GCD = " + gcd);

	}

}
