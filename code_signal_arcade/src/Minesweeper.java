/*24.
*
* In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
Check out the image below for better understanding:*/

public class Minesweeper {

    int[][] minesweeper(boolean[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] out = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int count = 0;
                for(int k=i-1; k<=i+1; k++){
                    for(int l=j-1; l<=j+1; l++){
                        if(k>=0 && l>=0 && k<m && l<n && matrix[k][l]){
                            count++;
                        }
                    }
                }
                if(matrix[i][j]){
                    count = count-1;
                }

                out[i][j] = count;

            }
        }

        return out;
    }

}
