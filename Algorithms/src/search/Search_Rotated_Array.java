package search;

public class Search_Rotated_Array {

	public static void search(int[] a,int key,int low,int high){
		
		if(low > high){
			System.out.println("Key not found");
			return;
		}
		
		int mid=(low + high)/2;
		
		if(key==a[mid]){
			System.out.println("Key Found");
			return;
		}
		
		if(a[low] <= a[mid]){
			if(key >= a[low] && key < a[mid])
				search(a,key,low,mid-1);
			else
				search(a,key,mid+1,high);
		}else if(a[mid] <= a[high]){
			if(key > a[mid] && key <= a[high])
				search(a,key,mid+1,high);
			else
				search(a,key,low,mid-1);
		}
	}
	
	public static void main(String[] args) {
		
		int a[]={10,15,20,0,5};
		int key=5;
		
		search(a,key,0,a.length-1);

	}

}
