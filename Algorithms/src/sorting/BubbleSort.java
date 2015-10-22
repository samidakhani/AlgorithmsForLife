package sorting;

public class BubbleSort {
	//Time complexity O(n2)
	//Space complexity O(1)
	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void sort(int[] a){
		
		int n=a.length;
		int temp;
		for (int i = 1; i <=n-1 ; i++) {
			for(int j=0;j<=n-i-1;j++){
				if(a[j] > a[j+1]){
				    temp=a[j];
				    a[j]=a[j+1];
				    a[j+1]=temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args){
		
		int a[]={30,20,10,50,60,40};
	    sort(a);
	    display(a);
		
	}

}
