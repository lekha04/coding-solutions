import java.util.*;

//Leetcode 66
public class PlusOne {
    public  static int[] plusOne2(int[] digits){

        List<Integer> list = new ArrayList<Integer>();
        int n = digits.length;

        int sum = digits[n-1] + 1;
        int carry = sum/10;
        int rem = sum%10;
        list.add(rem);

        int i = n-2;
        while(sum > 9 && i>=0){
            sum = digits[i] + carry;
            carry = sum/10;
            rem = sum%10;
            list.add(rem);
            i--;
        }

        if(carry > 0){
            list.add(carry);
        }

        int m = list.size();
        int diff = n - m;

        while(diff > 0){
            list.add(digits[diff - 1]);
            diff--;
        }

        System.out.println(list.toString());

        int[] out = new int[list.size()];

        int listlen = list.size();
        for(int k=0, j=listlen-1; j>=0; k++,j--){
            out[k] = list.get(j);
        }

        return out;
    }

    public  static int[] plusOne(int[] digits){
        int n = digits.length;
        int sum = digits[n-1] + 1;
        if(sum <= 9){
            digits[n-1] = sum;
            return digits;
        }

        List<Integer> list = new ArrayList<Integer>();
        int carry = sum/10;
        int rem = sum%10;
        list.add(rem);
        int i = n-2;

        while(i>=0){
            if(carry > 0){
                sum = digits[i] + carry;
                carry = sum/10;
                rem = sum%10;
                list.add(rem);
            }
            else{
                list.add(digits[i]);
            }
            i--;
        }

        if(carry > 0){
            list.add(carry);
        }

        System.out.println(list.toString());

        int m = list.size();
        int[] out = new int[m];

        for(int k=0, j=m-1; j>=0; k++, j--){
            out[k] = list.get(j);
        }

        return out;
    }

    public static void main(String[] args){

        int[] digits = new int[]{9, 9 , 9};
        int[] out = plusOne(digits);
        System.out.println(Arrays.toString(out));

    }
}
