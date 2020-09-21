/*36. Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.*/

import java.util.*;

public class DifferentSymbolsNaive {

    int differentSymbolsNaive(String s) {
        int n = s.length();

        if(n==1){
            return n;
        }

        Set<Character> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(s.charAt(i));
        }

        return set.size();
    }

}
