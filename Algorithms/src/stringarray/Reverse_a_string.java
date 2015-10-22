package stringarray;

public class Reverse_a_string {
	
/* C and C++ implementation
 * 	void reverse(char *str){
		
		char *end=str;
		char *reverse;
		
		while(*end !='\0'){
			end++;
		}
		end--;
		
		char *tmp=reverse;
		while(*str!='\0'){
			*reverse=*end;
			reverse++;
			end--;
			str++;
		}
		
		*reverse='\0';
        return tmp;
		
	}*/
	
	
	
	public static void main(String[] args) {
		
		String str="sami;";
		char[] chars=str.toCharArray();
		
		char[] reverse=new char[chars.length];
		int i=0;
		
		for (int j=chars.length-1;j>=0;j--,i++) {
			reverse[i]=(char)chars[j];	
		}
		System.out.println(reverse);
		
		
	}

}
