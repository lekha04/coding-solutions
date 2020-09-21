import java.util.*;
public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;

        if(n<=1){
            return false;
        }

        if(k==1){
            return true;
        }

        for(int i=0; i<n-1; i++){
            int sum = nums[i];
            for(int j=i+1; j<n; j++){
                sum += nums[j];
                if(sum==k || (k!=0 && sum%k == 0)){
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args){
        int[] nums = new int[]{23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums,k));
    }
}
