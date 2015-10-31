package bits;

public class BitsFlip {

	public static int no_of_flips(int a,int b){
		int c=a^b;
		int count=0;
		while(c!=0){
			if((c&1)==1)count++;
			c=c>>1;
		}
		return count;
	}
	
	public static void main(String[] args) {

		System.out.println(no_of_flips(15, 1));
	}

}
