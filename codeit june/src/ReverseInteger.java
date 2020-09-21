//Leetcode 7
public class ReverseInteger {
    public static int reverse(int x){
        long rev = 0;
        int num = x;

        while(num!=0){
            int lastdigit = num%10;
            rev = rev*10 + lastdigit;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
            num = num/10;
        }

        return (int) rev;
    }

    public static void main(String[] args){
        int x = -123;
        int out = reverse(x);
        System.out.println(out);
    }
}
