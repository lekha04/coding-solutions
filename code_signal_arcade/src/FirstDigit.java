/*35. Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.*/

public class FirstDigit {

    char firstDigit(String inputString) {

        int n = inputString.length();

        char c =' ';

        for(int i=0; i<n; i++){
            c = inputString.charAt(i);
            if(Character.isDigit(c)){
                return c;
            }
        }

        return c;
    }

}
