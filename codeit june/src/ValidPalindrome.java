//Leetcode 125
import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        String str = s.toLowerCase();
        System.out.println(str);
        int n = s.length();
        int i=0;
        int j=n-1;

        while(i<j){
            char f = str.charAt(i);
            char l = str.charAt(j);

            if(Character.isLetterOrDigit(f) && Character.isLetterOrDigit(l)){
                if(f==l){
                    i++;
                    j--;
                    continue;
                }
                else{
                    return false;
                }
            }

            if(!Character.isLetterOrDigit(f)){
                i++;
            }
            if(!Character.isLetterOrDigit(l)){
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        String str3 = "Hannah";
        boolean out = isPalindrome(str2);
        System.out.println(out);
    }
}
