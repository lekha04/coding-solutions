/*28. Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".*/

public class AlphabeticShift {

    String alphabeticShift(String inputString) {
        int n = inputString.length();

        char[] idx = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u','v','w','x','y','z'};

        StringBuilder builder = new StringBuilder();
        for(int i=0; i<n; i++){
            int val = (inputString.charAt(i) - 'a') + 1;

            if(val > 25){
                val = 0;
            }

            builder.append(idx[val]);
        }

        return builder.toString();
    }

}
