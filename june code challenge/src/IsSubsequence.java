import java.util.*;
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t){
        int m = s.length();
        int n = t.length();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        if(i<m){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        String s = "axc";
        String t = "ahbgdc";
        boolean out = isSubsequence(s,t);
        System.out.println(out);
    }
}
