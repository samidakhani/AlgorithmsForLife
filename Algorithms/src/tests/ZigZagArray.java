package tests;

import java.util.Arrays;

public class ZigZagArray {

	public static void printArray(int[] intArr){
		
		 int[] resultArr=new int[intArr.length];

	        Arrays.sort(intArr);
	        for(int i=0;i<intArr.length/2;i++){
	            int temp=intArr[i];
	            intArr[i]=intArr[intArr.length-(i+1)];
	            intArr[intArr.length-(i+1)]=temp;
	        }
	        
	        int first=0;
	        int last=intArr.length-1;
	        
	        int index=0;
	        
	        while(first <= last){
	            
	            if(first==last){
	                resultArr[index]=resultArr[first];
	                break;
	            }
	            
	            resultArr[index]=resultArr[first];
	            index++;
	            first++;
	            
	            resultArr[index]=resultArr[last];
	            index++;
	            last--;
	            
	        }
	    
		
		for(int i=0;i<resultArr.length;i++){
			System.out.println(resultArr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a={1,3,6,9,-3};
		//int[] a={5,2,7,8,-2,25,25};
		printArray(a);

	}

}
