/*55. Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
differentSquares(matrix) = 6.

Here are all 6 different 2 × 2 squares:

1 2
2 2
2 1
2 2
2 2
2 2
2 2
1 2
2 2
2 3
2 3
2 1*/

import java.util.*;

public class DifferentSquares {

    int differentSquares2(int[][] matrix) {

        if(matrix.length<2 || matrix[0].length<2){
            return 0;
        }

        Set<String> rows = new HashSet<>();

        Set<String> cols = new HashSet<>();

        for(int i=0; i<matrix.length; i++){
            StringBuilder builder = new StringBuilder();
            for(int j=0; j<matrix[i].length; j++){
                builder.append(matrix[i][j]);
            }
            rows.add(builder.toString());
        }

        for(int j=0; j<matrix[0].length; j++){
            StringBuilder builder = new StringBuilder();
            for(int i=0; i<matrix.length; i++){
                builder.append(matrix[i][j]);
            }
            cols.add(builder.toString());
        }

        if(rows.size()==1 && cols.size()==1){
            return 1;
        }

        return (rows.size()-1) * (cols.size()-1);

    }

    int differentSquares(int[][] matrix){
        if(matrix.length<2 || matrix[0].length<2){
            return 0;
        }

        Set<String> set = new HashSet<>();

        for(int i=0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[i].length-1; j++){
                StringBuilder builder = new StringBuilder();
                for(int ii = i; ii<=i+1; ii++){
                    for(int jj = j; jj<=j+1; jj++){
                        builder.append(matrix[ii][jj]);
                    }
                }
                set.add(builder.toString());
            }
        }

        return set.size();
    }

}
