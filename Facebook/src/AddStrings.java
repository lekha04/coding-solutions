import java.util.*;
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();

        int i = n1-1;
        int j = n2-1;

        int sum = 0;
        int carry = 0;
        int rem = 0;

        StringBuilder builder = new StringBuilder();

        while(i>=0 && j>=0){
            int x = num1.charAt(i) - '0';
            int y = num2.charAt(j) - '0';
            sum = x + y + carry;
            carry = sum/10;
            rem = sum%10;
            builder.append(rem);

            i--;
            j--;
        }

        while (i >= 0) {
            int x = num1.charAt(i) - '0';
            sum = x + carry;
            carry = sum/10;
            rem = sum%10;
            builder.append(rem);
            i--;
        }

        while (j >= 0) {
            int y = num2.charAt(j) - '0';
            sum = y + carry;
            carry = sum/10;
            rem = sum%10;
            builder.append(rem);
            j--;
        }

        if(carry>0){
            builder.append(carry);
        }

        return builder.reverse().toString();
    }

    public static void main(String[] args){
        String num1 = "1789";
        String num2 = "15";

        String out = addStrings(num1, num2);
        System.out.println(out);

    }
}
