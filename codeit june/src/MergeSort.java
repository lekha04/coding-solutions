import java.util.*;
public class MergeSort {

    public static int[] mergeSort(int[] nums){
        int n = nums.length;
        if(n<=1){
            return nums;
        }

        int[] left = Arrays.copyOfRange(nums,0, n/2);
        int[] right = Arrays.copyOfRange(nums, n/2, n);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right){
        int m = left.length;
        int n = right.length;
        int[] out = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(left[i] <= right[j]){
                out[k] = left[i];
                i++;
            }
            else{
                out[k] = right[j];
                j++;
            }

            k++;
        }

        while(i<m){
            out[k] = left[i];
            i++;
            k++;
        }

        while(j<n){
            out[k] = right[j];
            j++;
            k++;
        }

        return out;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,5,3,4,0};
        int[] out = mergeSort(nums);
        System.out.println(Arrays.toString(out));
    }
}
