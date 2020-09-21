import java.util.*;
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);

        int n = s.length();

        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for(int i=0; i<=n; i++){
            if(dp[i]){
                for(int j=i+1; j<=n; j++){
                    String str = s.substring(i, j);
                    if(set.contains(str)){
                        dp[j] = true;
                    }
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args){
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        System.out.println(wordBreak(s, wordDict));
    }
}
