//Leetcode 53
public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int max = nums[0];

        for(int i=0, j=1; i<n && j<n;){
            sum = sum + nums[j];
            max = Math.max(max, sum);

            while(sum < nums[j]){
                sum = sum - nums[i];
                max = Math.max(max, sum);
                i++;
            }

            j++;
        }

        return max;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
