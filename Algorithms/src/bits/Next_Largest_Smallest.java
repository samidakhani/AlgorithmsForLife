package bits;

public class Next_Largest_Smallest {

	public static int getBits(int n){
		int count=0;
		
		while(n != 0){
			if((n & 1)==1) count++;
			n=n>>1;
		}
		return count;
	} 
	
	public static int findLargest(int num){
		
		int bitCount=getBits(num);
		int largest=0;
		int largeCount=0;
		
		for (largest = num+1; largest <= Integer.MAX_VALUE; largest++) {
			largeCount=getBits(largest);
			if(largeCount==bitCount){
				break;
			}
		}
		
		return largest;
	}
	
	public static int findSmallest(int num){
		int bitCount=getBits(num);
		int smallest=0;
		int smallCount=0;
		
		for (smallest = num-1; smallest>=0; smallest--) {
		    smallCount=getBits(smallest);
			if(smallCount==bitCount){
				break;
			}
		}
		
		return smallest;
	}
	
	public static void main(String[] args) {

		System.out.println(findSmallest(2));
	}

}
