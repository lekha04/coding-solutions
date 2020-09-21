/*37. Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.*/

public class ArrayMaxConsecutiveSum {

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {

        int n = inputArray.length;

        int sum = 0;

        for(int i=0; i<k; i++){
            sum+=inputArray[i];
        }

        int max = sum;

        for(int i=0,j=k; i<n && j<n; i++,j++){
            sum = sum-inputArray[i]+inputArray[j];
            max = Math.max(max, sum);
        }

        return max;
    }

}
