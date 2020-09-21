import java.util.*;
public class CoinChangeII {

    public static int change(int amount, int[] coins) {
        return changeHelper(amount, coins, 0);
    }

    public static int changeHelper(int amount, int[] coins, int i){
        if(amount==0){
            return 1;
        }

        if(amount<0){
            return 0;
        }

        int sum = 0;
        for(; i<coins.length; i++){
            sum += changeHelper(amount-coins[i], coins, i);
        }

        return sum;
    }

    public static void  main(String[] args){
        int[] coins = new int[]{1, 2, 5};
        int amount = 5;
        int out = change(amount, coins);
        System.out.println("output : " + out);
    }

}
