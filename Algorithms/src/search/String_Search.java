package search;

public class String_Search {

	public static void search(String[] strings,String key,int low,int high){
		
		if(low > high){
			System.out.println("Key not found");
			return;
		}
		
		int mid=(low + high)/2;
		
		if(strings[mid].isEmpty()){
			int left=mid-1;
			int right=mid+1;
			
			while(true){
				if(left < low && right > high){
					System.out.println("Key not founnd");
					return;
				}
				
				if(right <= high && !strings[right].isEmpty() ){
					mid=right;
					break;
				}else if(left >= low && !strings[left].isEmpty()){
					mid=left;
					break;
				}
				right++;
				left--;;
			}
		}
		
		if(strings[mid].equals(key)){
			System.out.println("Key found");
			return;
		}else if(key.compareTo(strings[mid]) > 0){
			search(strings, key, mid+1 , high);
		}else{
			search(strings,key,low,mid-1);
		}
	}
	
	public static void main(String[] args) {
	 
	   String[] strings={"ab","","","","","ad","ae"};
	   String key="ae";
	   
	   search(strings,key,0,strings.length-1);

	}

}
