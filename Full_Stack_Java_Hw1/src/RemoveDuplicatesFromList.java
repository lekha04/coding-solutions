//Problem 2. Remove Duplicates from a List (use most efficient and different ways)

import java.util.*;
public class RemoveDuplicatesFromList {

    public static List<Integer> removeDuplicatesBySorting(List<Integer> list){

        int n = list.size();

        if(n <= 1){
            return list;
        }

        Collections.sort(list);

        List<Integer> out = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            if(list.get(i)==list.get(i+1)){
               continue;
            }
            out.add(list.get(i));
        }

        out.add(list.get(n-1));

        return out;

    }

    public static List<Integer> removeDuplicatesUsingSet(List<Integer> list){
        int n = list.size();

        if(n <= 1){
            return list;
        }

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(list.get(i));
        }

        List<Integer> out = new ArrayList<>();

        for(int val : set){
            out.add(val);
        }

        return out;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(2);

        System.out.println("Before : " + list.toString() );

        List<Integer> out = removeDuplicatesUsingSet(list);

        System.out.println("After : " + out.toString() );

    }
}
