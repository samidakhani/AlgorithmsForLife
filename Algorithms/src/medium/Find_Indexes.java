package medium;

public class Find_Indexes {

	public static void printIndies(int[] a){
		int end_left=getLeftEnd(a);
		if(end_left == -1) System.out.println("Entire array is sorted");
		
		int start_right=getRightStart(a);
		
		int left_first=end_left;
		int right_first=shrinkRight(a,end_left,start_right);

		int left_second=shrinLeft(a,end_left,start_right);
		int right_second=start_right;
		
		int a_size1=(left_first+1)+(a.length-right_first);
		int a_size2=(left_second+1)+(a.length-right_second);
		
		if(a_size1 >= a_size2){
			System.out.println(left_first + " " + right_first);
		}else{
			System.out.println(left_second + " " + right_second);
		}
	}
	
	public static int shrinkRight(int[] a,int left,int right){
		for(int i=right;i<=a.length-1 ;i++){
			if(a[left] <= a[i]) return i;
		}
		return 0;
	}
	
	public static int shrinLeft(int[] a,int left,int right){
		for (int i=left; i >=0; i--) {
			if(a[right] >= a[i]) return i;
		}
		
		return 0;
	}
	
	
	public static int getLeftEnd(int[] a){
		
		for(int i=0;i<=a.length-2;i++){
			if(a[i]>a[i+1])  return i;
		}
		return -1;
	}
	
	public static int getRightStart(int[] a){
		for(int i=a.length-1;i>=1;i--){
			if(a[i]<a[i-1]) return i;
		}
		return 0;
	}
	
	
	
	
	
	public static void main(String[] args) {
       int[] a={1,2,4,7,10,11,8,12,5,6,16,18,19};
       printIndies(a);
	}

}
