package search;

public class BinarySearch {

	public static void searchIterative(int[] array,int key,int low,int high){
		
		while(low<=high){
			
			int mid=(low+high)/2;
			
			if(key==array[mid]){
				System.out.println("Key Found");
				return;
			}
			
			if(key < array[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
			
		}
		
		System.out.println("Key Not Found");
	}
	
	public static void search(int[] array,int key,int low,int high){
		
		if(low > high) {
			System.out.println("Key Not Found");
			return;
		}
		
		int mid=(low+high)/2;
		
		if(key==array[mid]){
			System.out.println("Key Found");
			return;
		}
		
		if(key<array[mid])
		   search(array,key,low,mid-1);
		else
		   search(array,key,mid+1,high);
	}
	public static void main(String[] args) {
		int[] array={10,20,30,40,50,60};
		int key=0;
		
		searchIterative(array,key,0,array.length-1);

	}

}
