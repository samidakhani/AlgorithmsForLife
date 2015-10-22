package recurssionanddp;

public class Magic_Index {

	public static int magicIndex(int[] a, int low,int high){
		
		if(low > high)
		    return -1;
		
		int mid=(low + high) /2;
		
		if(a[mid]==mid)
			return mid;
		
		if(a[mid] < mid)
			return magicIndex(a,mid+1, high);
		else
			return magicIndex(a, low,mid-1);
		
	}
	
	public static void main(String[] args) {

		int[] a={-40,-20,-1,1,2,3,5,7,9,12,13};
		System.out.println(magicIndex(a,0, a.length-1));
	}

}
