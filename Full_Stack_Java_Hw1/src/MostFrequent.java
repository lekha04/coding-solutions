//Problem 6. Return the most frequent elements of an Array

import java.util.*;
public class MostFrequent {

    public static String mostFrequent(String[] str){
        int n = str.length;

        if(n<=1){
            return str[0];
        }

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int count = map.getOrDefault(str[i], 0);
            map.put(str[i],count+1);
        }

        //System.out.println(map.toString());

        int max = Integer.MIN_VALUE;
        String out = "";

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                out = entry.getKey();
            }
        }

        return out;
    }

    public static void main(String[] args){
        String[] str = new String[]{"cat","bat","cat","rat","rat","cat"};
        System.out.println(Arrays.toString(str));
        String out = mostFrequent(str);
        System.out.println("Answer is : " + out);
    }
}
