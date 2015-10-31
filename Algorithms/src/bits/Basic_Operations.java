package bits;

public class Basic_Operations {

	static boolean getBit(int num,int i){
		return ((num & (1<<i)) !=0);
	} 
	
	static int setBit(int num,int i){
		return num |(1<<i);
	}
	
	static int clearBit(int num,int i){
	    int mask=~(1<<i);
	    return num & mask;
	}
	
	static int clearBitsMSBthroughI(int num,int i){
	    int mask=(1<<i) -1;
	    return num & mask;
	}
	
	static int clearBitsIthroughLSB(int num,int i){
		int mask= (~0 << (i+1));
		return num & mask;
	}
	
	static int updateBit(int num,int i,int v){
	    int mask=~(1<<i);
	    return (num & mask) | (v << i);
	}
	
	public static void main(String[] args) {
       
	   int num=7;
       System.out.println(updateBit(num,1,0));
	}

}
