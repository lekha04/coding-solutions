import java.util.*;
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        subsetsHelper(0, nums, new ArrayList<Integer>(), out);
        return out;
    }

    public static void subsetsHelper(int index, int[] nums, List<Integer> current, List<List<Integer>> out){
        out.add(new ArrayList<>(current));

        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            subsetsHelper(i+1, nums, current, out);
            current.remove(current.size()-1);
            System.out.println(current.toString());
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        List<List<Integer>> out = subsets(nums);
    }
}
