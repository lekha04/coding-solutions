/*26. Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.*/

public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {

        while(n>0){
            int rem = n%10;
            if(rem%2!=0){
                return false;
            }
            n = n/10;
        }

        return true;
    }

}
