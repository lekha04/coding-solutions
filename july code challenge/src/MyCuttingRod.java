import java.util.*;
public class MyCuttingRod {
    public static int myCuttingRod(int[] prices, int n){
        int[] dp = new int[n+1];

        for(int j=0; j<dp.length; j++){
            dp[j] = prices[0]*j;
        }

        for(int i=2; i<n; i++){
            for(int j=1; j<dp.length; j++){
                if(j>=i){
                    int temp = dp[j-i] + prices[i-1];
                    dp[j] = Math.max(dp[j], temp);
                }
            }
        }

        System.out.println(Arrays.toString(dp));

        return dp[n];
    }

    public static void main(String[] args){
        int n = 5;
        int[] prices = new int[]{2,5,7,8};
        int out = myCuttingRod(prices, n);
        System.out.println(out);
    }
}
