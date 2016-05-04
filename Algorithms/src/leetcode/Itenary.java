import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sdakhani on 4/27/16.
 */
public class Itenary {

    final static int ZERO = 0;
    public static void findItenary(String[][] tickets){

        HashMap<String,List<String>> hash = new HashMap<String, List<String>>();

        //Extract the values in a hashmap
        for(int i=0;i<tickets.length;i++){
            String key = tickets[i][0];
            String value = tickets[i][1];
            List<String> valueList = null;

            if(hash.containsKey(key)){
                valueList = hash.get(key);
            }else{
                valueList = new ArrayList<String>();
            }
            valueList.add(value);
            hash.put(key,valueList);
        }

        //Sort the list of values in lexicographically
        for(String key: hash.keySet()){
            List<String> valueList = hash.get(key);
            Collections.sort(valueList);
            hash.put(key,valueList);
        }

        //Find the itenary
        String key = "JFK";
        List<String> results = new ArrayList<String>();
        results.add(key);

         while(hash.size() != ZERO){

             List<String> valueList = hash.get(key);
             String value = valueList.get(0);
             valueList.remove(0);

             if(valueList.size() == ZERO){
                 hash.remove(key);
             }

             results.add(value);
             key = value;

        }

        for(String city:results)
          System.out.print(city + " ");

    }

    public static void main(String[] args) {
       // String[][] tickets = {{"MUC","LHR"},{"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
           String[][] tickets = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        findItenary(tickets);


    }
}
