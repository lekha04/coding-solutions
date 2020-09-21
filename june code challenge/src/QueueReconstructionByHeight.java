//Greedy
import java.util.*;
public class QueueReconstructionByHeight {
    public static int[][] reconstructQueue(int[][] people){

        int[][] ppl = new int[people.length][2];
        System.arraycopy(people, 0, ppl, 0, people.length);
        Arrays.sort(ppl, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]==b[0] ? a[1] - b[1] : b[0] - a[0];
            }
        });

        LinkedList<int[]> output = new LinkedList<>();
        for(int[] p : ppl){
            output.add(p[1], p);
        }

        int[][] out = new int[people.length][2];
        return output.toArray(out);

    }

    public static void main(String[] args){
        int[][] people = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] out = reconstructQueue(people);
        for(int[] arr : out){
            System.out.println(Arrays.toString(arr));
        }
    }
}
