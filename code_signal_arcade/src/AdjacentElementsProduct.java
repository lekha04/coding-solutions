/*4. Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.*/

public class AdjacentElementsProduct {

    int adjacentElementsProduct(int[] inputArray) {
        int n = inputArray.length;

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n-1; i++){
            int product = inputArray[i] * inputArray[i+1];
            max = Math.max(max, product);
        }

        return max;
    }
}
