//Leetcode 349
import java.util.*;
public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;

        int m = nums1.length;
        int n = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int len = set.size();
        int[] out = new int[len];
        int g = 0;
        for (Integer k : set) {
            out[g] = k;
            g++;
        }

        return out;

    }

    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,5,1,2};
        int[] nums2 = new int[]{2,4,5,2,4};
        int[] out = intersection(nums1, nums2);
        System.out.println(Arrays.toString(out));
    }
}
