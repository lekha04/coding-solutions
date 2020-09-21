public class ArrangingCoins {

    public static int arrangeCoins(int n){
        int diff = n;
        int i = 1;

        while(diff>0){
            diff = diff - i;
            i++;
        }

        if(diff==0){
            return i-1;
        }

        return i-2;
    }

    public static void main(String[] args){
        int n = 0;
        int out = arrangeCoins(n);
        System.out.println(out);
    }
}
