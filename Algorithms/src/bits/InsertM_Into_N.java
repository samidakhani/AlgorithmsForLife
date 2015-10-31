package bits;

public class InsertM_Into_N {

	public static int updateBits(int n,int m,int i,int j){
		
		int ones=~0;
		int left=ones << (j+1);
		int right=(ones<<i)-1;
		int mask=left|right;
		
		return (n & mask) | (m<<i);
		
	}
	
	public static void main(String[] args) {
       System.out.println(updateBits(24, 3, 1, 2));
	}

}
