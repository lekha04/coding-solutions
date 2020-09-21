/*9. Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"]. */

import java.util.*;

public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {
        int n = inputArray.length;

        int max = inputArray[0].length();

        for(int i=1; i<n; i++){
            max = Math.max(max, inputArray[i].length());
        }

        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(inputArray[i].length() == max){
                list.add(inputArray[i]);
            }
        }

        String[] out = new String[list.size()];

        int i = 0;
        for(String s : list){
            out[i] = s;
            i++;
        }

        return out;
    }

}
