package stringarray;

public class Substring_Check {
    //Rotation Check
	public static boolean isSubstring(String s1,String s2){
		
		if(s1.contains(s2)) return true;
		return false;
		
	}
	public static void main(String[] args) {
		
		String s1="waterbottle";
		String s2="erbottlewat";
		
		if(s1.length() != s2.length()){
			System.out.println(false);
			return;
		}
		
		String check = s2 + s2;
		System.out.println(isSubstring(check, s1));
		

	}

}
