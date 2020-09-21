import java.util.*;
public class ProductOfAllExceptSelf {

    public static void product(int[] nums){
        int n = nums.length;
        int mul = 1;

        for(int i=0; i<n; i++){
            mul = mul*nums[i];
        }

        for(int i=0; i<n; i++){
            nums[i] = mul/nums[i];
        }

    }

    public  static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        product(nums);
        System.out.println(Arrays.toString(nums));
    }
}
