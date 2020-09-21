import java.util.*;
import java.math.BigInteger;
public class AddBinary {
    public static String addBinary2(String a, String b) {
       return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b, 2));
    }

    public static String addBinary3(String a, String b) {
        int m = a.length();
        int n = b.length();

        if(m>n){
            for(int i=0; i<m-n; i++){
                 b = "0" + b;
            }
        }
        else if(m<n){
            for(int i=0; i<n-m; i++){
                 a = "0" + a;
            }
        }

        int c = 0;
        StringBuilder builder = new StringBuilder();

        for(int i=n-1; i>=0; i--){
            int v1 = Integer.parseInt(String.valueOf(a.charAt(i)));
            int v2 = Integer.parseInt(String.valueOf(b.charAt(i)));

            int sum = (v1^v2)^c ;
            builder.append(sum);

            c = (v1&v2) | ((v1^v2)&c);
        }

        return builder.reverse().toString();
    }

    public static String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a,2);
        BigInteger y = new BigInteger(b,2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, sum;

        while(y.compareTo(zero)!=0){
            sum = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = sum;
            y = carry;
        }

        return x.toString(2);
    }

    public static void main(String[] args){
        String a = "1111";
        String b = "10";
        String out = addBinary(a,b);
        System.out.println(out);
    }

}
