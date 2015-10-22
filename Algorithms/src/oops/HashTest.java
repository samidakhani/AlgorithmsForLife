package oops;

public class HashTest {

	public static void main(String[] args) {
		
		Hash<String,String> hash =new Hash<String, String>();
		
		hash.put("Sami", "Dakhani");
		hash.put("Suraj", "Kadam");
		
		System.out.println(hash.get("Suraj"));

	}

}
