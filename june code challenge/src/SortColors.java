import java.util.*;
public class SortColors {
    public static void sortColors(int[] nums){
        int n = nums.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>=1; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
