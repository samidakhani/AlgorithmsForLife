package medium;

public class Number_String {

	static String[] digits={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	static String[] teens={"Eleven","Twelve","Therteen","Fourteen","Fifeteen","Sixteen","Seventeen","Eightteen","Nineteen"};
	static String[] tens={"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eightty","Ninety"};
	static String[] bigs={"","Thousand","Million","Billion"};
	
	public static String number100(int number){
		
		String str="";
		
		if(number >=100){
			str=digits[number/100 -1] + " Hundred ";
			number %=100;
		}
		
		if(number>=11 && number <=19){
			str +=teens[number-11];
			return str;
		}else if(number==10 || number >=20){
			str +=tens[number/10-1] + " ";
			number %=10;
		}
		
		if(number>=1 && number<=9){
			str +=digits[number-1];
		}
		
		return str;
		
	}
	
	public static String number(int number){
		
		if(number==0)
			return "Zero";
		else if(number < 0)
			return "Negative " + number(-1 * number);
		
		int count=0;
		String str="";
		
		while(number > 0){
	      str=number100(number % 1000)+ " " +bigs[count] + " " + str;
	      number /=1000; 
	      count ++;
		}
		
		return str;
	}
	
	
	public static void main(String[] args) {

		System.out.println(number(1933));
	}

}
