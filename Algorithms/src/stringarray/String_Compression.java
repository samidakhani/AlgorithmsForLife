package stringarray;

public class String_Compression {

	public static void main(String[] args) {
		
		String str="aabb";
		String new_str="";
		int length=str.length();
		int i=0;
		
		while(i<length){
			char master=str.charAt(i);
			int count=1;
			
			int j=i+1;
			
			while(j<length){
				char slave=str.charAt(j);
				
				if(master==slave){
				  count++;
				  j++;
				}else{
					break;
				}
			}
			
			new_str=new_str + str.charAt(i)+ count;
			i=j;
			
		}
		
		if (new_str.length() > length) {
			System.out.println(str);
		}else{
			System.out.println(new_str);
		}
		
	}

}
