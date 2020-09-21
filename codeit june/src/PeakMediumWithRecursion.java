import java.util.*;

public class PeakMediumWithRecursion {

    public static int findPeakElement(int[] nums){
        int n = nums.length;

        if(n/2 - 1 >= 0 && nums[n/2] < nums[n/2 - 1]){
            return findPeakElement(Arrays.copyOfRange(nums, 0, n/2));
        } else if (n/2 + 1 < n && nums[n/2] < nums[n/2 + 1]) {
            return findPeakElement(Arrays.copyOfRange(nums, n/2+1, n)) + (n/2+1);
        }
        return n/2;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,3,4,5,6,7,10};
        int out = findPeakElement(nums);
        System.out.println(out);
    }

}
