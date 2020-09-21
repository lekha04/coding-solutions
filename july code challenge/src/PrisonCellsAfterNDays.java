import java.util.*;
public class PrisonCellsAfterNDays {

    public static int[] prisonAfterNDays(int[] cells, int N){

        if(N==0){
            return cells;
        }

        N = N%14;

        int[] out = new int[8];
        out[0] = 0;
        out[7] = 0;

        for(int k=1; k<=N; k++){
            for(int i=1; i<7; i++){
                if(cells[i-1] == cells[i+1]){
                    out[i] = 1;
                }
                else{
                    out[i] = 0;
                }
            }
            System.out.println(Arrays.toString(out));
            cells = out;
            out = new int[8];
        }

        return cells;
    }

    public static void main(String[] args){
        int[] cells = new int[]{1,0,0,1,0,0,0,1};
        int N = 826;
        int[] out = prisonAfterNDays(cells, N);
        System.out.println("output is " + Arrays.toString(out));
    }

}
