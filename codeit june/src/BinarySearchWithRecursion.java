public class BinarySearchWithRecursion {

    public static boolean searchHelper(int[] nums, int target, int first, int last){
        if(first<=last) {
            int mid = (first + last) / 2;
            if (target == nums[mid]) {
                return true;
            }
            if (target > nums[mid]) {
                return searchHelper(nums, target, mid + 1, last);
            }
            if (target < nums[mid]) {
                return searchHelper(nums, target, first, mid - 1);
            }
        }
       return false;
    }

    public static boolean search(int[] nums, int target){
        int n = nums.length;
        int first = 0;
        int last = n-1;
        boolean out = searchHelper(nums, target, first, last);
        return out;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 12;
        boolean out = search(nums,target);
        System.out.println(out);
    }

}
