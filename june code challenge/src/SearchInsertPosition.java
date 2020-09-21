public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target){
        int n = nums.length;
        int first = 0;
        int last = n-1;

        while(first<=last){
            int mid = (first+last)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
        }

        return first;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        int target = 0;
        int out = searchInsert(nums, target);
        System.out.println(out);
    }

}
