/*54. CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

Example

For inputString = "2 apples, 12 oranges", the output should be
sumUpNumbers(inputString) = 14.*/

public class SumUpNumbers {

    int sumUpNumbers(String inputString) {

        int n = inputString.length();

        int count = 0;

        StringBuilder builder = new StringBuilder();
        for(int i=0; i<n; i++){
            if(Character.isDigit(inputString.charAt(i))){
                builder.append(inputString.charAt(i));
            }
            else{
                if(builder.length() > 0){
                    count += Integer.parseInt(builder.toString());
                    builder = new StringBuilder();
                }

            }
        }

        if(builder.length() > 0){
            count += Integer.parseInt(builder.toString());
        }

        return count;

    }

}
