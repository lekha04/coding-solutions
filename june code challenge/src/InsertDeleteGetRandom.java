import java.util.*;
public class InsertDeleteGetRandom {

    List<Integer> list;
    Map<Integer,Integer> map;
    Random rand;

    public InsertDeleteGetRandom(){
         list = new ArrayList<>();
         map = new HashMap<>();
         rand = new Random();
    }

    public boolean insert(int val){
        if(map.containsKey(val)){
            return false;
        }

        list.add(val);
        map.put(val, list.size()-1);

        return true;
    }

    public boolean remove(int val){
        if(!map.containsKey(val)){
            return false;
        }

        int lastElement = list.get(list.size()-1);
        int index = map.get(val);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size()-1);
        map.remove(val);

        return true;

    }

    public int getRandom(){
        int out = list.get(rand.nextInt(list.size()));
        return out;
    }

    public static void main(String[] args){
        InsertDeleteGetRandom o = new InsertDeleteGetRandom();

        System.out.println(o.insert(1));
        System.out.println(o.remove(2));
        System.out.println(o.insert(2));
        System.out.println(o.getRandom());
        System.out.println(o.remove(1));
        System.out.println(o.insert(2));
        System.out.println(o.getRandom()) ;
    }
}
