
import java.util.*;
public class FirstDuplicate {

    int firstDuplicate(int[] a){
        Map<Integer, Integer> indexMap = new HashMap<>();

        Map<Integer, Integer> countMap = new HashMap<>();

        int n = a.length;

        for(int i=0; i<n; i++){
            int count =  countMap.getOrDefault(a[i], 0) + 1;
            countMap.put(a[i], count);
            if(count<=2){
                indexMap.put(a[i], i);
            }
        }

        int idx = a.length-1;
        boolean flag = false;

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if(entry.getValue() > 1){
                flag = true;
                idx = Math.min(idx, indexMap.get(entry.getKey()));
            }
        }
        if(!flag){
            return -1;
        }

        return a[idx];
    }

}
