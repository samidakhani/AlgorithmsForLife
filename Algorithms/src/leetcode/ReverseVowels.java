import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdakhani on 4/28/16.
 */
public class ReverseVowels {

    private static boolean checkVowel(char ch){

        if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' ||
                ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
            return true;

        return false;
    }

    public static void main(String[] args) {

        String str="aA";

        char[] array= str.toCharArray();
        char[] changeArray = str.toCharArray();

        List<Integer> vowelsPos = new ArrayList<Integer>();
        List<Integer> reverseVowelsPos = new ArrayList<Integer>();

        for(int i=0;i<array.length;i++){
            if(checkVowel(array[i])){
                vowelsPos.add(i);
            }
        }

        for(int i=vowelsPos.size()-1;i>=0;i--){
            reverseVowelsPos.add(vowelsPos.get(i)) ;
        }

        for(int i : vowelsPos){
            changeArray[i]=array[reverseVowelsPos.get(0)];
            reverseVowelsPos.remove(0);
        }

        System.out.print(new String(changeArray));
    }
}
