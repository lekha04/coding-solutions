/*34. Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].*/

import java.util.*;

public class ExtractEachKth {

    int[] extractEachKth(int[] inputArray, int k) {
        int n = inputArray.length;

        if(k>n){
            return inputArray;
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if((i+1)%k==0){
                continue;
            }

            list.add(inputArray[i]);
        }

        int[] out = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            out[i] = list.get(i);
        }

        return out;

    }

}
