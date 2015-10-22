package sorting;

public class SelectionSort {
	//Time complexity O(n2)
	//Space complexity O(1)
	public static void sort(int[] a){
		
		int n=a.length;
		int small;
		int pos;
		
		for(int i=0;i<=n-2;i++){
			pos=i;
			small=a[i];
			
			for (int j = i+1; j <=n-1 ; j++) {
				if(a[j] < small){
					pos=j;
					small=a[j];
				}
			}
			
			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;	
		}
	}
	
	public static void main(String[] args){
		
		int a[]={30,20,10,50,60,40};
	    sort(a);
	    BubbleSort.display(a);
		
	}

}
