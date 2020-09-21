import java.util.*;
public class LowerUpper {

    public static int lowerUpper2(int[] a, int[] b, int lower, int upper){
        int m = a.length;
        int n = b.length;

        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int val = (a[i]*a[i]) + (b[j]*b[j]);
                if(val>=lower && val<=upper){
                    count++;
                }
            }
        }

        return count;
    }
    public static int lowerUpper(int[] a, int[] b, int lower, int upper){
        int m = a.length;
        int n = b.length;

        for(int i=0; i<m; i++){
            a[i] = a[i]*a[i];
        }

        Arrays.sort(a);

        for(int i=0; i<n; i++){
            b[i] = b[i]*b[i];
        }

        Arrays.sort(b);

        int out = 0;

        for(int i=0; i<m; i++){
            int lower_idx = Arrays.binarySearch(b, lower - a[i]);
            int upper_idx = Arrays.binarySearch(b, upper - a[i]);

            if (lower_idx < 0) {
                lower_idx = -(lower_idx+1);
            }

            if (upper_idx < 0) {
                upper_idx = -(upper_idx+1);
            }

            int count = upper_idx - lower_idx;
            out+=count;

        }

        return out;
    }

    public static int search(int num, int[] b){
        int first = 0;
        int last = b.length-1;

        while(first<=last){
            int mid = first + (last-first)/2;

            if(num==b[mid]){
                return mid;
            }
            else if(num>b[mid]){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] a = new int[]{3,-1,9};
        int[] b = new int[]{100,5,2};

        int lower = 7;
        int upper = 99;

        int out = lowerUpper(a,b,lower,upper);

        System.out.println(out);
    }
}
