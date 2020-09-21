
import java.util.*;
public class FirstNonRepeatingCharacter {

    char firstNotRepeatingCharacter(String s) {
        int n = s.length();

        if(n==1){
            return s.charAt(0);
        }

        Map<Character, Integer> map = new HashMap<>();

        Map<Character, Integer> index = new HashMap<>();

        for(int i=0; i<n; i++){
            int count = map.getOrDefault(s.charAt(i), 0);
            if(count==0){
                index.put(s.charAt(i), i);
            }
            map.put(s.charAt(i), count+1);
        }

        System.out.println(map.toString());

        int minIdx = n;
        boolean flag = false;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                flag = true;
                minIdx = Math.min(minIdx, index.get(entry.getKey()));
            }
        }
        if(!flag){
            return '_';
        }
        return s.charAt(minIdx);
    }

}
