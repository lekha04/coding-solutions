import java.util.*;
public class SingleNumberII {

    public static int singleNumber2(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i] == nums[i+1]){
                i = i+3;
            }
            else{
                return nums[i];
            }
        }

        return nums[i];
    }

    public static int singleNumber(int[] nums){
        Set<Long> set = new HashSet<>();
        long arrSum = 0;
        long setSum = 0;
        for(int val : nums){
            arrSum += val;
            set.add((long)val);
        }
        for(Long l : set){
            setSum += l;
        }

        return (int) ((3*setSum - arrSum)/2);
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,9,2,3,9,2,9};
        int out = singleNumber(nums);
        System.out.println(out);

    }
}
