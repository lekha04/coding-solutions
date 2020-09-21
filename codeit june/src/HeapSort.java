//Leetcode  921 - sort an array
import java.util.*;
public class HeapSort {

    public static void heapSort(int[] nums){
        int n = nums.length;

        for(int i=(n/2)-1; i>=0; i--){
            maxHeapify(nums, n, i);
        }

        for(int i=n-1; i>=0; i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            maxHeapify(nums, i, 0);
        }
    }

    public static void maxHeapify(int[] nums, int len, int i){
        int root = i;
        int left = (2*i)+1;
        int right = (2*i)+2;

        if(left<len && nums[root]<nums[left]){
            root = left;
        }

        if(right<len && nums[root]<nums[right]){
            root = right;
        }

        if(root!=i){
            int temp = nums[root];
            nums[root] = nums[i];
            nums[i] = temp;

            maxHeapify(nums, len, root);
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{4,1,3,2,16,9,10,14,8,7};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
