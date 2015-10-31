package bits;

public class ShiftBits {

	public static int shiftBits(int x){
		return (x & 0xaaaaaaaa)>>1  | (x & 0x55555555)<<1;
	}
	
	public static void main(String[] args) {

		System.out.println(shiftBits(7));
	}

}
