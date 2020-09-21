/*22. You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

Check out the image below for better understanding:

*/

import java.util.*;

public class AvoidObstacles {

    int avoidObstacles(int[] inputArray) {

        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<inputArray.length; i++){
            set.add(inputArray[i]);
            max = Math.max(max, inputArray[i]);
        }

        for(int i=1; i<=max; i++){
            int j;
            for(j=i; j<=max; j+=i){
                if(set.contains(j)){
                    break;
                }
            }

            if(j>max){
                return i;
            }
        }

        return max+1;
    }

}
