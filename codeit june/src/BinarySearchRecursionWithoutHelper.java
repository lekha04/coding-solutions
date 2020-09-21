//Using public static int[] Arrays.copyOfRange(int[] original_array, int from_index, int to_index). - to_index is exclusive
//Syatem.arrayCopy(source_array, src_position, destination_array, dest_position, length) does not work here as it
// requires a destination array and length of the destination array will cary for each recursion.

import java.util.Arrays;

public class BinarySearchRecursionWithoutHelper {

    public static int search(int[] nums, int target){
        int n = nums.length;
        int first = 0;
        int last = n-1;
        if(first == last){
            return first;
        }
        if(first<last){
            int mid = (first+last)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target>nums[mid]){
                nums = Arrays.copyOfRange(nums,mid+1,last+1);
                System.out.println(Arrays.toString(nums));
                return search(nums, target);
            }
            if(target<nums[mid]){
                nums = Arrays.copyOfRange(nums, first, mid);
                return search(nums, target);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 12;
        int out = search(nums, target);
        System.out.println(out);
    }
}
