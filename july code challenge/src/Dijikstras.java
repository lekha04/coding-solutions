import java.util.*;
public class Dijikstras {

    public static int[] shortestPath(int[][] graph, int src){
        int n = graph.length;

        int[] d = new int[n];

        boolean[] sp = new boolean[n];

        for(int i=0; i<n; i++){
            d[i] = Integer.MAX_VALUE;
        }

        d[src] = 0;

       for(int i=0; i<n; i++){
           int v = minimum(d, sp);

           for(int j=0; j<n; j++){
               if(graph[v][j] > 0 && !sp[j]){
                   int sum = graph[v][j] + d[v];
                   d[j] = Math.min(d[j], sum);
               }
           }
       }

       return d;
    }

    public static int minimum(int[] d, boolean[] sp){
        int min = Integer.MAX_VALUE;
        int v = 0;

        for(int i=0; i<d.length; i++){
            if(! sp[i]) {
                if(d[i] < min){
                    min = d[i];
                    v = i;
                }
            }
        }

        sp[v] = true;
        return v;
    }

    public static void main(String[] args){
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        int src = 0;

        int[] out = shortestPath(graph, src);

        System.out.println(Arrays.toString(out));
    }
}
