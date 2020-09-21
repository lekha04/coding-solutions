//Squares of a sorted array in leetcode
import java.util.*;
public class SquareArray {

    public static int[] squareArray(int[] nums){
        int n = nums.length;
        int i=0;
        int j = n-1;
        int[] out = new int[n];
        int k=n-1;

        while(i<=j && k>=0){

            if(i==j){
                out[k] = nums[i];
            }
            if(nums[i]*nums[i] >= nums[j]*nums[j]){
                out[k] = nums[i]*nums[i];
                i++;
            }
            else{
                out[k] = nums[j]*nums[j];
                j--;
            }

            k--;
        }

        return out;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] out = squareArray(nums);
        System.out.println(Arrays.toString(out));
    }
}
