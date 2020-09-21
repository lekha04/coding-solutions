import java.util.*;
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> out = new HashSet<>();

        List<Integer> list;

        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                int sum = nums[i] + nums[j] + nums[j+1];
                if(sum==0){
                    list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[j+1]);
                    out.add(list);
                }
            }
        }
         List<List<Integer>> result = new ArrayList<>();
         for(List intList : out){
             result.add(intList);
         }

        return result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1, 0 , 1, 2, -1, -4};
        List<List<Integer>> out = threeSum(nums);
        System.out.println(out.toString());
    }
}
