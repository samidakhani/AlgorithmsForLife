package search;

public class LinearSearch {
	
	public static void search(int[] array,int key){
		
		for (int item : array) {
			
			if(item==key){
				System.out.println("Key fouund");
				return;
			}
		}
		
		System.out.println("Key Not found");
	}
	
	public static void main(String[] args){
		
		int[] array={10,20,30,60,70,40};
		int key=100;
		
		search(array,key);
	}

}
