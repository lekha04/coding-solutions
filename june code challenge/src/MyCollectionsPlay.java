import java.util.*;
public class MyCollectionsPlay {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(1);
        list.add(4);
        list.add(10);

        System.out.println(list.toString());

        list.remove(Integer.valueOf(4));

        System.out.println(list.toString());

        list.remove(2);

        System.out.println(list.toString());

        //map.put(500, 4);
        //map.put(500, 2); -- this will replace the value of the key 500. ie. 4 will be replaces by 2.
    }
}
