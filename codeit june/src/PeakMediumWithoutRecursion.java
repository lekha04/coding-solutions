public class PeakMediumWithoutRecursion {

    public static int findPeakElement(int[] nums){
        int n = nums.length;
        int first = 0;
        int last = n-1;

        while(first<last){
            int mid = (first+last)/2;
            if(mid>0 && nums[mid]<nums[mid-1]){
                last = mid-1;
            }
            else if(mid<n-1 && nums[mid]<nums[mid+1]){
                first = mid+1;
            }
            else{
                return mid;
            }
        }

        if(first==last){
            return first;
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,3,4,5,6,7,10};
        int out = findPeakElement(nums);
        System.out.println(out);
    }
}
