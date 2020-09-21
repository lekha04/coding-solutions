public class SqyareRoot {
    public static int mySqrt2(int x) {

        if(x<=1){
            return x;
        }
        int i = x/2;

        while(i*i > x){
            i--;
        }

        return i;
    }

    public static int mySqrt(int x) {
        if(x<=1){
            return x;
        }

        int min = 0;
        int max = Math.min(x, 46340);

        while(min<=max){
            int mid = (min+max)/2;
            int sq = mid * mid;
            if(sq==x){
                return mid;
            }
            else if(sq>x){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return min-1;
    }
    public static void main(String[] args){
        int x = 8;
        int out = mySqrt(x);
        System.out.println(out);
    }
}
