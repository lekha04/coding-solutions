import java.util.Arrays;

//Leetcode 1
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
    public static void main (String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
