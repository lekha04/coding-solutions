//CodeSignal interview prep - Arrays

import java.util.*;
public class IsCryptSolution {

    boolean isCryptSolution(String[] crypt, char[][] solution) {
        Map<Character,Character> map = new HashMap<>();

        for(int i=0; i<solution.length; i++){
            map.put(solution[i][0],solution[i][1]);
        }

        double[] nums = new double[3];

        for(int i=0; i<crypt.length; i++){
            String s = crypt[i];
            if(s.length()>1 && map.get(s.charAt(0))=='0'){
                return false;
            }
            StringBuilder builder = new StringBuilder();
            char[] arr = s.toCharArray();

            for(char c : arr){
                builder.append(map.get(c));
            }

            nums[i] = Double.parseDouble(builder.toString());
        }

        if(nums[0] + nums[1] == nums[2]){
            return true;
        }

        return false;
    }

}
