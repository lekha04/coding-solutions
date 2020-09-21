//Leetcode 704
public class BinarySearchWithoutRecursion {

    public static int search(int[] nums, int target){
        int n = nums.length;
        int first = 0;
        int last = n-1;

        while(first<=last){
            int mid = (first+last)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int out = search(nums, target);
        System.out.println(out);
    }
}
