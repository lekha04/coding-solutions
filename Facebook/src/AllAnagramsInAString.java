import java.util.*;
public class AllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> out = new ArrayList<>();

        if(s.length()<p.length()){
            return out;
        }

        int[] pchar_count = new int[26];

        for(int i=0; i<p.length(); i++){
            pchar_count[p.charAt(i) - 'a']++;
        }

        int count = p.length();
        int left = 0;
        int right = 0;

        while(right<s.length()){
            if(pchar_count[s.charAt(right++) - 'a']-- >=1){
                count--;
            }

            if(count==0){
                out.add(left);
            }

            if(right-left == p.length() && pchar_count[s.charAt(left++) - 'a']++ >=0){
                count++;
            }
        }

        return out;
    }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> out = findAnagrams(s,p);
        System.out.println(out.toString());
    }
}
