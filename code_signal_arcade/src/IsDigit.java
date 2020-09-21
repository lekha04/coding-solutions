/*48. Determine if the given character is a digit or not.

Example

For symbol = '0', the output should be
isDigit(symbol) = true;
For symbol = '-', the output should be
isDigit(symbol) = false.*/

public class IsDigit {

    boolean isDigit(char symbol) {
        if(Character.isDigit(symbol)){
            return true;
        }

        return false;
    }

}
