import java.util.*;

public class MinDiffOfArrays {

    public static int minDiffOfArrays(int[] a, int[] b ){
        int n = a.length;

        int[] temp = new int[n];

        System.arraycopy(a,0,temp,0,n);

        Arrays.sort(temp);

        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int j = Arrays.binarySearch(temp, b[i]);

            if(j<0){
                j = -(j+1);
            }

            if(j >= n){
                j = j-1;
            }

            int t = a[i];
            a[i] = temp[j];

            min = Math.min(min, minDiff(a,b));

            a[i] = t;
        }

        return min;

    }

    public static int minDiff(int[] a, int[] b){
        int n = b.length;

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += Math.abs(a[i]-b[i]);
        }

        return sum;
    }

    public static void main(String[] args){
        int[] a = new int[]{6,4,8,2,0};
        int[] b = new int[]{11,6,8,3,9};

        int out = minDiffOfArrays(a,b);

        System.out.println(out);
    }

}
