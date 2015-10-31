package bits;

public class Power2 {

	public static boolean check_power2(int num){
		return ((num & (num-1))==0);
	}
	
	public static void main(String[] args) {
		 
      System.out.println(check_power2(17));
	}

}
