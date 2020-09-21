import java.util.*;
public class FindDuplicateProof {

    public static int findDuplicate(int[] nums){
        int len = nums.length;
        int high = len-1;
        int i=0, j=len-1;
        int out = 0;
        while(i<j && high>0){
            if(nums[i]==high){
                if(nums[i]!=nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j--;
                    i=0;
                    high--;
                }
                else{
                    out = nums[i];
                    break;
                }
            }
            else{
                i++;
            }
        }

        return out;
    }

    public static void main(String[] args){
        int[] nums = new int[]{3,1,3,4,2};
        int out = findDuplicate(nums);
        System.out.println(out);
    }
}
