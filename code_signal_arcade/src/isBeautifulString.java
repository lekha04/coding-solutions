/*43. A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc.

Given a string, check whether it is beautiful.

Example

For inputString = "bbbaacdafe", the output should be isBeautifulString(inputString) = true.

This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters that appear more frequently than the previous letter, this string qualifies as beautiful.

For inputString = "aabbb", the output should be isBeautifulString(inputString) = false.

Since there are more bs than as, this string is not beautiful.

For inputString = "bbc", the output should be isBeautifulString(inputString) = false.

Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.*/

import java.util.*;

public class isBeautifulString {

    boolean isBeautifulString(String inputString) {
        int n = inputString.length();

        Map<Character, Integer> map = new TreeMap<>();

        String idx = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<idx.length(); i++){
            map.put(idx.charAt(i), 0);
        }

        for(int i=0; i<n; i++){
            int count = map.get(inputString.charAt(i));
            map.put(inputString.charAt(i), count+1);
        }

        int temp = 0;
        boolean flag = false;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(!flag){
                temp = entry.getValue();
                flag = true;
            }
            else{
                if(entry.getValue() > temp){
                    return false;
                }
                temp = entry.getValue();
            }
        }

        return true;
    }

}
