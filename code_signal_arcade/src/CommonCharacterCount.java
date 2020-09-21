/*10. Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".*/

import java.util.*;

public class CommonCharacterCount {

    int commonCharacterCount(String s1, String s2) {

        Map<Character, Integer> map1 = new HashMap<>();

        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            int count = map1.getOrDefault(s1.charAt(i), 0);
            map1.put(s1.charAt(i), count+1);
        }

        for(int i=0; i<s2.length(); i++){
            int count = map2.getOrDefault(s2.charAt(i), 0);
            map2.put(s2.charAt(i), count+1);
        }
        int count = 0;

        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            int min = Math.min(entry.getValue(), map2.getOrDefault(entry.getKey(), 0));
            count += min;
        }

        return count;
    }

}
