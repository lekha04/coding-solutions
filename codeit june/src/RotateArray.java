import java.util.Arrays;

//Leetcode 189
public class RotateArray {

    public static void rotate2(int[] nums, int k){
        int n = nums.length;

        if(n==1 || (n==k)){
            return;
        }

        for(int i=0; i<k; i++){
            int temp = nums[n-1];
            int j = n-1;
            while(j>=1){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
    }

    public static void rotate3(int[] nums, int k){
        int n = nums.length;

        if(n==1 || k==n){
            return;
        }

        if(n<k){
            k = k - n;
        }

        int[] output = new int[k];

        for(int i=n-k, j=0; i<n && j<k; i++, j++){
            output[j] = nums[i];
        }

        for(int i=n-1, j=n-k-1; i>=n-k-1 || j>=0; i--,j--){
            nums[i] = nums[j];
        }

        for(int i=0; i<k; i++){
            nums[i] = output[i];
        }
    }

    public static void rotate(int[] nums, int k){

        int n = nums.length;
        if(n==k){
            return;
        }
         if(n<k){
             k=k-n;
         }

         int[] output = new int[n];

         for(int i=0, j=n-k; i<k && j<n; i++,j++){
             output[i] = nums[j];
         }

         for(int i=k, j=0; i<n && j<n-k; i++,j++){
             output[i] = nums[j];
         }

         for(int i=0; i<n; i++){
             nums[i] = output[i];
         }

    }


    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}
