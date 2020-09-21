/*27. Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.

Example

For name = "var_1__Int", the output should be
variableName(name) = true;
For name = "qq-q", the output should be
variableName(name) = false;
For name = "2w2", the output should be
variableName(name) = false.*/

public class VariableName {

    boolean variableName(String name) {
        String str = name.toLowerCase();

        int n = name.length();

        if(!Character.isLetter(str.charAt(0)) && str.charAt(0)!='_'){
            return false;
        }

        for(int i=1; i<n; i++){
            char c = str.charAt(i);

            if(!Character.isLetterOrDigit(c) && c!='_'){
                return false;
            }
        }

        return true;

    }

}
