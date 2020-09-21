/*52. Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".*/

public class LongestWord {

    String longestWord(String text){
        int n = text.length();

        StringBuilder builder = new StringBuilder();

        int max = Integer.MIN_VALUE;
        String out = "";

        for(int i=0; i<n; i++){
            if(Character.isLetter(text.charAt(i))){
                builder.append(text.charAt(i));
            }
            else{
                if(builder.length() > max){
                    max = builder.length();
                    out = builder.toString();
                }
                builder = new StringBuilder();
            }
        }

        if(builder.length() > max){
            out = builder.toString();
        }

        return out;

    }
}
