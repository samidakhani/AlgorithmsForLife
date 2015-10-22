package sorting;

public class QuickSort {

	public static int partition(int[] a,int low,int high){
		
		int temp;
		int pivot=a[low];
		int i=low+1;
		int j=high;
		
		while(i<=j){
		  
			while(a[i] <= pivot)
				i++;
			
			while(a[j]> pivot)
				j--;
			
			if(i<j){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		temp=a[low];
		a[low]=a[j];
		a[j]=temp;
		
		return j;
		
	}
	
	public static void quickSort(int[] a,int low,int high){
		
		if(low < high){
			int mid=partition(a,low,high);
			quickSort(a, low, mid-1);
			quickSort(a, mid+1, high);
		}
	}
	
	public static void main(String[] args) {
		
		int a[]={30,20,10,50,60,40};
	    quickSort(a,0,a.length-1);
	    BubbleSort.display(a);

	}

}
