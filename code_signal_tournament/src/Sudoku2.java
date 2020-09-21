import java.util.*;
public class Sudoku2 {

    boolean sudoku2(char[][] grid) {

        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(grid[i][j]=='.'){
                    continue;
                }

                if(set.contains(grid[i][j]) || grid[i][j]<'1' || grid[i][j]>'9'){
                    return false;
                }

                set.add(grid[i][j]);
            }
        }

        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(grid[j][i]=='.'){
                    continue;
                }

                if(set.contains(grid[j][i]) || grid[j][i]<'1' || grid[j][i]>'9'){
                    return false;
                }

                set.add(grid[j][i]);
            }
        }

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                Set<Character> set = new HashSet<>();
                for(int ii=i; ii<i+3; ii++){
                    for(int jj=j;jj<j+3; jj++){
                        if(grid[ii][jj]=='.'){
                            continue;
                        }

                        if(set.contains(grid[ii][jj]) || grid[ii][jj]<'1' || grid[ii][jj]>'9'){
                            return false;
                        }

                        set.add(grid[ii][jj]);
                    }
                }
            }
        }


        return true;
    }

}
