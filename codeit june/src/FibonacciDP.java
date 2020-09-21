import java.util.*;
public class FibonacciDP {

    public static int fib(int num){
        Map<Integer, Integer> map = new HashMap<>();
        return fibDPHelper(num, map);
    }

    public static int fibDPHelper(int num, Map<Integer, Integer> map){
        if(num<=1){
            map.put(num, num);
        }

        if(!map.containsKey(num)){
            int val = fibDPHelper(num-1, map) + fibDPHelper(num-2, map);
            map.put(num, val);
            return val;
        }
        else{
            int val = map.get(num);
            return val;
        }
    }

    public static void main(String[] args){
        int num = 7;
        int out = fib(num);
        System.out.println(out);
    }
}
