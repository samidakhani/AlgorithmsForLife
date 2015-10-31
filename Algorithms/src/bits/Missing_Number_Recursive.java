package bits;

import java.math.BigInteger;
import java.util.ArrayList;

public class Missing_Number_Recursive {

	public static int findMissing(ArrayList<BigInteger> input){
		return findMissing(input,0);
	}
	
	
	public static int findMissing(ArrayList<BigInteger> input,int column){
		
		if(column > 31){
			return 0;
		}
		
		ArrayList<BigInteger> oneBits=new ArrayList<BigInteger>();
		ArrayList<BigInteger> zeroBits=new ArrayList<BigInteger>();
		
		for (BigInteger t : input) {
			if(t.testBit(column)){
				oneBits.add(t);
			}else{
				zeroBits.add(t);
			}
		}
		
		if(zeroBits.size() > oneBits.size()){
			int v=findMissing(oneBits,column+1);
			return (v<<1)|1;
		}else{
			int v=findMissing(zeroBits,column+1);
			return (v<<1)|0;
		}
	}
	
	
	
	
	public static void main(String[] args) {

		BigInteger zero=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		BigInteger two=new BigInteger("2");
		BigInteger four=new BigInteger("4");
		BigInteger five=new BigInteger("5");
		
		 ArrayList<BigInteger> input=new ArrayList<BigInteger>();
		 input.add(zero);
		 input.add(one);
		 input.add(two);
		 input.add(four);
		 input.add(five);
		 
		 System.out.println(findMissing(input));
	}

}
