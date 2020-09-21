import java.util.*;
public class ProductOfArrayExceptSelf {

    //left right product
    public static int[] productExceptSelf2(int[] nums){
        int n = nums.length;

        int[] left = new int[n];
        left[0] = 1;

        int[] right = new int[n];
        right[n-1] = 1;

        for(int i=1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        for(int i=n-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i=0; i<n; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }

    //space
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;

        int[] left = new int[n];
        left[0] = 1;

        for(int i=1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        int R=1;

        for(int i=n-2; i>=0; i--){
            R = R*nums[i+1];
            left[i] = left[i] * R;
        }

        return left;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        int[] out = productExceptSelf(nums);
        System.out.println(Arrays.toString(out));
    }
}
