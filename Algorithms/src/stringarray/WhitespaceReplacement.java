package stringarray;

public class WhitespaceReplacement {
	
	public static void main(String[] args) {
		
		String str="Sami is going to be a good boy";
		int space_count=0;
		char[] chars=str.toCharArray();
		
		for (char c : chars) {
			if(c==' '){
				space_count++;
			}
		}
		
		int newlength=chars.length + (space_count * 2);
		char[] new_chars=new char[newlength];
		int j=0;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]==' '){
				new_chars[j++]='%';
				new_chars[j++]='2';
				new_chars[j++]='0';
			}else {
				new_chars[j++]=chars[i];
			}			
		}
		
		System.out.println(new String(new_chars));
	}
}
