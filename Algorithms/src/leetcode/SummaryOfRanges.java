import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.
   For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryOfRanges {

    public static List<String> summaryRanges(int[] nums) {

        List<List<Integer>> rangeList = new ArrayList<List<Integer>>();
        List<String> summary = new ArrayList<String>();

        if(nums.length == 0) {
            return summary;
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]+1){
                rangeList.add(list);
                list = new ArrayList<Integer>();
            }
            list.add(nums[i]);
        }

        if(list.size() > 0){
            rangeList.add(list);
        }

        for(List<Integer> itemList:rangeList){
            String str="";
            if(itemList.size() > 1) {
                str = itemList.get(0) + "->" + itemList.get(itemList.size() - 1);
            }else{
                str = itemList.get(0).toString() ;
            }

            summary.add(str);
        }

      return  summary;
    }

    public static void main(String[] args) {

        int[] nums ={};

        List<String> summary = summaryRanges(nums);

        for (String str: summary){
            System.out.println(str);
        }
    }
}
