package recurssionanddp;

public class Magic_Index_Duplicate {

	public static int magicIndex(int[] a, int low, int high){
		if(low > high || low < 0  || high > a.length-1)
			return -1;
		
		int midIndex=(low+high)/2;
		int midValue=a[midIndex];

		if(midIndex==midValue)
			return midIndex;
		
		int leftindex=Math.min(midIndex-1,midValue);
		int left=magicIndex(a, low, leftindex);
		if(left != -1)
			return left;
		
		int rightIndex=Math.max(midIndex+1,midValue);
        int right=	magicIndex(a,rightIndex, high);	
		return right;
	}
	public static void main(String[] args) {

		int[] a={-10,-5,2,2,2,3,4,7,9,12,13};
		System.out.println(magicIndex(a,0, a.length-1));
	}

}
