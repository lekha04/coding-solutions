//Comparable interface in java with example - https://beginnersbook.com/2017/08/comparable-interface-in-java-with-example/

import java.util.*;
public class MyComparable {

    /* Comparable interface is mainly used to sort arrays or lists. Arrays and lists of objects (for objects that have
    a natural ordering) that implement comparable interface can be sorted automatically
    by Collections.sort or Arrays.sort methods. Before we see how to sort an array or list
    of custom objects (that do not have a natural ordering), lets see how we can sort
    elements of types that already implement comparable interface*/

    public static void main(String[] args){

        //Integer class implements comparable interface and so we can sort an array of integer using sort method
        int[] nums = new int[]{ 11,55,22,0,89};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //String class implements comparable interface and so we can sort an array of strings using sort method.
        String[] names = new String[]{"ant", "animal", "bat", "antelope", "dog", "cat"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //String class implements comparable and so we can sort a list of strings using sort method.
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        Collections.sort(fruits);
        System.out.println(fruits.toString());
    }
}
