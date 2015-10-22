package sorting;

public class MergeArrays {

	public static void merge(int[] a,int[] b,int lastA,int lastB){
		
		int indexA=lastA-1;
		int indexB=lastB-1;
		int indexMerge=lastA+lastB-1;
		
		while(indexA >=0 && indexB >=0){
			if(a[indexA] > b[indexB]){
				a[indexMerge--]=a[indexA--];
			}else{
				a[indexMerge--]=b[indexB--];
			}
		}
		
		while(indexB >=0){
			a[indexMerge--]=b[indexB--];
		}
	}
	
	public static void main(String[] args) {
		
		int[] a={10,60,0,0,0};
		int[] b={40,70,80};
		int lastA=a.length-b.length;
		int lastB=b.length;
		merge(a, b,lastA,lastB);
		BubbleSort.display(a);
	}

}
