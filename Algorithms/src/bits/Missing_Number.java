package bits;

import java.math.BigInteger;
import java.util.ArrayList;

public class Missing_Number {

	public static int setBit(int num,int i,int v){
		return num |(v<<i);
	}
	
	
	public static int findMissing(ArrayList<BigInteger> input){
		
	   int number=0;
	   int index=0;
	   ArrayList<BigInteger> zeroBits=new ArrayList<BigInteger>();
	   ArrayList<BigInteger> oneBits=new ArrayList<BigInteger>();
	   
	   do{
		   
		   oneBits.clear();
		   zeroBits.clear();
		   
		   for(BigInteger t:input){
			   if(t.testBit(index))
			      oneBits.add(t);
			   else
				  zeroBits.add(t); 
		   }
		   
		   if(zeroBits.size() > oneBits.size()){
			   number=setBit(number,index,1);
			   input.clear();
			   input.addAll(oneBits);
		   }else{
			   number=setBit(number,index,0);
			   input.clear();
			   input.addAll(zeroBits);
		   }
		   
		   index++;
		   
	   }while(zeroBits.size()!=0 && oneBits.size()!=0);
	   
	   return number;
	
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
