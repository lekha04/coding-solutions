/*40. Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".*/

public class LongestDigitPrefix {

    String longestDigitsPrefix2(String inputString) {
        int n = inputString.length();

        String out = "";

        if(inputString.charAt(0) == ' '){
            return out;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            if(inputString.charAt(i)==' '){
                break;
            }

            if(Character.isDigit(inputString.charAt(i))){
                StringBuilder builder = new StringBuilder();
                while(i<n && Character.isDigit(inputString.charAt(i))){
                    builder.append(inputString.charAt(i));
                    i++;
                }
                String str = builder.toString();
                if(str.length() > max){
                    max = str.length();
                    out = str;
                }
            }
        }

        return out;

    }

    String longestDigitsPrefix(String inputString){
        return inputString.replaceAll("[^0-9]+.*", "");
    }

}
