//Problem 9. From array of strings, group anagrams togethers (please check what is anagram)

import java.util.*;
public class AnagramGrouping {

    public static List<List<String>> groupAnagram(String[] arr){

        List<List<String>> out;

        int n = arr.length;

        if(n<=0){
            out = new ArrayList<>();
            return out;
        }

        List<String> list;

        if(n==1){
            list = new ArrayList<>();
            list.add(arr[0]);
            out = new ArrayList<>();
            out.add(list);
            return out;
        }

        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            char[] temp = arr[i].toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);
            list = map.getOrDefault(s, new ArrayList<>());
            list.add(arr[i]);
            map.put(s,list);
        }

        out = new ArrayList(map.values());

        return out;
    }

    public static void main(String[] args){
        String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println("Input : " + Arrays.toString(arr));
        List<List<String>> out = groupAnagram(arr);
        System.out.println("Output : ");
        for(List<String> list : out){
            System.out.println(list.toString());
        }
    }
}
