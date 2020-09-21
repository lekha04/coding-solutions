//Leetcode 461
public class HammingDistance {

    public static int hammingDistance(int x, int y){

        int val = x ^ y;
        int count = 0;
        while(val>0){
            count += val&1;
            val = val>>1;
        }

        return count;
    }

    public static void main(String[] args){
        int out = hammingDistance(1, 4);
        System.out.println(out);

    }
}
