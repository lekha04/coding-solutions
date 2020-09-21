//Problem 8. Merge two sorted arrays and return new sorted array

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        int[] out = new int[m+n];
        int i = 0, j=0, k=0;

        while(i<m && j<n){
            if(a[i]<=b[j]){
                out[k] = a[i];
                i++;
            }
            else{
                out[k] = b[j];
                j++;
            }

            k++;
        }

        while(i<m){
            out[k] = a[i];
            i++;
            k++;
        }

        while(j<n){
            out[k] = b[j];
            j++;
            k++;
        }

        return out;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,1,2,5,9};
        int[] b = new int[]{1,3,4,8,10};

        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));

        int[] out = mergeSortedArrays(a,b);

        System.out.println("Output : " + Arrays.toString(out));
    }
}
