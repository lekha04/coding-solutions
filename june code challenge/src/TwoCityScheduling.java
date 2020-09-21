//Greedy
import java.util.*;
public class TwoCityScheduling {

    public static class Pairs{
        int diff;
        int[] cityCost;

        public Pairs(int diff, int[] cityCost){
            this.diff = diff;
            this.cityCost = cityCost;
        }
    }

    public static int twoCitySchedCost(int[][] costs){

        int n = costs.length;
        Pairs[] arr = new Pairs[n];

        for(int i=0; i<n; i++){
            int diff = costs[i][0] - costs[i][1];
            arr[i] = new Pairs(diff, new int[]{costs[i][0], costs[i][1]});
        }

        Arrays.sort(arr, new Comparator<Pairs>(){
            public int compare(Pairs p1, Pairs p2){
                return p1.diff - p2.diff;
            }
        });

        int out = 0;

        for(int i=0; i<n/2; i++){
            out += arr[i].cityCost[0];
        }

        for(int i=n/2; i<n; i++){
            out+= arr[i].cityCost[1];
        }

        return out;
    }

    public static void main(String[] args){
        int[][] costs = new int[][]{{10,20}, {30,200}, {400,50}, {30,20}};
        int out = twoCitySchedCost(costs);
        System.out.println(out);
    }
}
