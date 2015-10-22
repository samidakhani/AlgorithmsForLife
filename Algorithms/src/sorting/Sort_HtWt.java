package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_HtWt {

	public static void sort(HtWt[] array){
		
		ArrayList<HtWt> max_array=new ArrayList<HtWt>();
		ArrayList<HtWt> temp_array=new ArrayList<HtWt>();
		
		Arrays.sort(array,new HtWtComparator());
		
		int i=0;
		
		while(i < array.length){
			
			temp_array.clear();
			temp_array.add(array[i]);
			int j =i+1;
			while(j < array.length){
				
				if(array[i].weight >= array[j].weight){
			         temp_array.add(array[j]);
			         i=j;
			         j++;
			    }else{	
			    	break;
			    }		
			}
			
			i=j;
			
			if(temp_array.size() > max_array.size()){
				max_array.clear();
				max_array.addAll(temp_array);
			}
			
		}
		
		System.out.println("Largest Sequence " + max_array.size());
		for (HtWt htWt : max_array) {
			System.out.println(htWt.height + " " + htWt.weight);
		}
		
	}
	
	public static void main(String[] args) {
		
		HtWt p1=new HtWt(10,134);
		HtWt p2=new HtWt(20,120);
		HtWt p3=new HtWt(10,180);
		HtWt p4=new HtWt(30,170);
		HtWt p5=new HtWt(90,160);
		HtWt p6=new HtWt(80,120);
		HtWt p7=new HtWt(70,110);
		HtWt p8=new HtWt(40,130);
		HtWt p9=new HtWt(60,130);
		HtWt p10=new HtWt(50,140);
		
		HtWt[] array={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        sort(array);
        
//        for (HtWt htWt : array) {
//			System.out.println(htWt.height);
//		}
		
	}

}
