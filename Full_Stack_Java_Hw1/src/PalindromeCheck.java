//Problem 3. Implement and validate whether a given string is a palindrome

public class PalindromeCheck {

    public static boolean isPalindrome(String s){
        int n = s.length();
        if(n<=1){
            return true;
        }

        s = s.toLowerCase();

        int i=0;
        int j=n-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args){
        String s = "Hannah";
        System.out.println("Given string is " + s );
        System.out.println(isPalindrome(s));
    }
}
