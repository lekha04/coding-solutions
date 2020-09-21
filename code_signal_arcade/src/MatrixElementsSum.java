/*8. After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that
 all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that
 are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2],
          [0, 5, 0, 0],
          [2, 0, 3, 3]]
the output should be
matrixElementsSum(matrix) = 9. */

public class MatrixElementsSum {

    int matrixElementsSum(int[][] matrix) {
        int n = matrix.length;

        int count = 0;

        for(int j=0; j<matrix[0].length; j++){
            if(matrix[0][j] != 0){
                count += matrix[0][j];
            }
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i-1][j]!=0 && matrix[i][j]!=0){
                    count += matrix[i][j];
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }

        return count;
    }

}
