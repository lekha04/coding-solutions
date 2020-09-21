/*20. Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.*/

public class ArrayMaximalAdjacentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int n = inputArray.length;

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n-1; i++){
            int diff = Math.abs(inputArray[i] - inputArray[i+1]);
            max = Math.max(max, diff);
        }

        return max;
    }

}
