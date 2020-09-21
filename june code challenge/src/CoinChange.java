import java.util.*;
public class CoinChange {

    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0] = 0;
        int min = Integer.MAX_VALUE;

        for(int i=1; i<dp.length; i++){
            dp[i] = amount+1;
        }

        for(int i=1; i<dp.length; i++){
            for(int coin : coins){
                if(i>=coin){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }

        System.out.println(Arrays.toString(dp));

        return dp[amount]>amount ? -1 : dp[amount];
    }

    public static void main(String[] args){
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        int out = coinChange(coins, amount);
        System.out.println("output : " + out);
    }
}
