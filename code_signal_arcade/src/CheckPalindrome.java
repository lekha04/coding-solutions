/*3. Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.*/

public class CheckPalindrome {

    boolean checkPalindrome(String inputString) {

        int n = inputString.length();

        int i=0;
        int j=n-1;

        while(i<j){
            if(inputString.charAt(i) != inputString.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
