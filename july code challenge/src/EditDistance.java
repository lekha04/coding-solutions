import java.util.*;
public class EditDistance {
    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        if(n*m==0){
            return n+m;
        }

        int[][] dp = new int[m+1][n+1];

        for(int i=0; i<m+1; i++){
            dp[i][0] = i;
        }

        for(int j=0; j<n+1; j++){
            dp[0][j] = j;
        }

        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                int diag = dp[i-1][j-1];
                int left = dp[i][j-1];
                int up = dp[i-1][j];

                if(word2.charAt(i-1) == word1.charAt(j-1)){
                    dp[i][j] = diag;
                }
                else{
                    dp[i][j] = Math.min(diag, Math.min(left,up)) + 1;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args){
        String word1 = "benyam";
        String word2 = "ephrem";
        int out = minDistance(word1, word2);
        System.out.println(out);
    }

}
