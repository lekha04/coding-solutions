import java.util.*;
public class ReversePair {

    public static int reverse(int num){

        if(num<10){
            return num;
        }

        int rev = 0;

        while(num>0){
            rev = rev*10;
            rev = rev + (num%10);
            num = num/10;
        }

        return rev;
    }

    public static int reversePair2(int[] arr) {

        int n = arr.length;

        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int lhs = arr[i] + reverse(arr[j]);
                int rhs = arr[j] + reverse(arr[i]);

                if(lhs==rhs){
                    count++;
                }
            }
        }

        return count;
    }

    public static int reversePair(int[] arr){
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int val = arr[i] - reverse(arr[i]);
            int count = map.getOrDefault(val,0);
            map.put(val,count+1);
        }

        int out = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int comb = entry.getValue()*(entry.getValue()+1)/2;
            out += comb;
        }

        return out;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,20,2,11};
        int out = reversePair(arr);
        System.out.println(out);
    }
}
