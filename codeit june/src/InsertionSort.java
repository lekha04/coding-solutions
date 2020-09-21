import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] nums){
        int n = nums.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = new int[]{5,2,4,6,1,3};
        int[] out = insertionSort(nums);
        System.out.println(Arrays.toString(out));
    }
}
