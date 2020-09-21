/*15. Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]*/

public class AddBorder {

    String[] addBorder(String[] picture) {
        int m = picture.length;
        int n = picture[0].length();

        String[] out = new String[m+2];

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<n+2; i++){
            builder.append('*');
        }

        out[0] = builder.toString();
        out[out.length-1] = builder.toString();

        //System.out.println(Arrays.toString(out));

        for(int i=1; i<out.length-1; i++){
            String s = '*' + picture[i-1] + '*';
            out[i] = s;
        }

        return out;
    }

}
