/*59. Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]
*/

public class SpiralNumbers {

    int[][] spiralNumbers(int n) {

        int[][] a = new int[n][n];
        int val = 1;
        int minRow = 0;
        int maxRow = n;
        int minCol = 0;
        int maxCol = n;

        while(minRow<maxRow && minCol<maxCol){
            for(int i=minCol; i<maxCol; i++){
                a[minRow][i] = val++;
            }
            minRow++;

            for(int i=minRow; i<maxRow; i++){
                a[i][maxCol-1] = val++;
            }
            maxCol--;

            if(minRow<maxRow){
                for(int i=maxCol-1; i>=minCol; i--){
                    a[maxRow-1][i] = val++;
                }
                maxRow--;
            }

            if(minCol<maxCol){
                for(int i=maxRow-1; i>=minRow; i--){
                    a[i][minCol] = val++;
                }
                minCol++;
            }
        }

        return a;
    }

}
