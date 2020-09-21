import java.util.*;
public class CoinChangeIIDP {
    public static int change(int amount, int[] coins){
        int[] dp = new int[amount+1];
        dp[0] = 1;

        for(int coin : coins){
            for(int x=coin; x<=amount; x++){
                dp[x] += dp[x-coin];
            }
        }

        return dp[amount];
    }

    public static void  main(String[] args){
        int[] coins = new int[]{1, 2, 5};
        int amount = 5;
        int out = change(amount, coins);
        System.out.println("output : " + out);
    }
}
