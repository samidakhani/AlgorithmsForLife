package extras;

public class Number_Of_Digits {

	public static void main(String[] args) {
		
		int number=3124213;
		int count=0;
		
		while(number != 0){
			count ++;
			number = number / 10;
		}
		
		System.out.println(count);

	}

}
