package sorting;

public class MergeSort {
	//Time complexity--O(n log n)
	//Space complexity--Depends
	
	public static void merge(int[] a, int low,int mid,int high){
		
		int[] c=new int[a.length];
		int i,j,k;
		
		i=low;
		j=mid+1;
		k=low;
		
		while(i <= mid && j <= high){
			if(a[i]<a[j]){
				c[k++]=a[i++];
			}else{
				c[k++]=a[j++];
			}
		}
		
		while(i <= mid){
			c[k++]=a[i++];
		}
		
		while(j <= high){
			c[k++]=a[j++];
		}
		
		for (int x = low; x <=high; x++) {
			a[x]=c[x];
		}
		
		
	}
	
	public static void mergeSort(int[] a,int low,int high){
		
		if(low < high){
			int mid=(low+high)/2;
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			merge(a,low,mid,high);
		}
	}
	
	public static void main(String[] args) {
		
		int a[]={30,20,10,50,60,40};
	    mergeSort(a,0,a.length-1);
	    BubbleSort.display(a);
	}

}
