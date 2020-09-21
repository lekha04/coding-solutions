import java.util.*;
public class SubarraySum {

    public static int subarraySum(int[] nums, int k){
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        map.put(sum, 1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}
