/*45. Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".*/

public class BuildPalindrome {

    String buildPalindrome2(String st) {

        String str = st;

        for(int i=0,j=str.length()-1; i<j; i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                char lastChar = str.charAt(str.length()-1);
                for(int k=0; k<str.length()-1;k++){
                    if(str.charAt(k)==lastChar){
                        String sub = str.substring(0,k);
                        StringBuilder b = new StringBuilder();
                        b.append(sub);
                        b.reverse();
                        str = str + b.toString();
                        i=0;
                        j=str.length()-1;
                        break;
                    }
                }
            }
        }

        return str;
    }

    String buildPalindrome(String st){

        if(isPalindrome(st)){
            return st;
        }

        StringBuilder b = new StringBuilder(st);
        int i=1;
        for(; i<st.length(); i++){
            String str = st.substring(i,st.length());
            if(isPalindrome(str)){
                break;
            }
        }

        for(int j=i-1; j>=0; j--){
            b.append(st.charAt(j));
        }

        return b.toString();

    }

    boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


}
