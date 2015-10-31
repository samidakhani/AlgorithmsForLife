package medium;

public class Traling_Zeros_of_Factorial {

	public static int countZerosOther(int num){
		
		int count =0;
		
		for(int i=5;num/i > 0;i=i*5){
			count +=num/i;
		}
		
		return count;
	}
	
	public static int countFives(int num){
		int count=0;
		while( num % 5 == 0){
			count ++;
			num=num/5;
		}
		return count;
	}

	public static int countZeros(int num){
		
		int count=0;
		for(int i=2;i<=num;i++){
			count +=countFives(i);
		}
		return count;
		
	}
	
	public static void main(String[] args) {
	
		System.out.println(countZerosOther(25));

	}

}
