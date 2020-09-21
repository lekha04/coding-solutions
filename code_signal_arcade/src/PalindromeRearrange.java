/*18. Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.*/

import java.util.*;

public class PalindromeRearrange {

    boolean palindromeRearranging(String inputString) {
        int n = inputString.length();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int count = map.getOrDefault(inputString.charAt(i), 0);
            map.put(inputString.charAt(i), count+1);
        }

        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 != 0){
                count++;
            }

            if(count > 1){
                return false;
            }
        }

        return true;
    }

}
