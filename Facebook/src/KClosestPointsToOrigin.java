import java.util.*;
public class KClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int K) {
        int n = points.length;

        int[] dist = new int[n];

        for(int i=0; i<n; i++){
            dist[i] = distance(points[i]);
        }

        Arrays.sort(dist);
        int distK = dist[K-1];

        int[][] out = new int[K][2];
        int t=0;

        for(int i=0; i<n; i++){
            if(distance(points[i])<=distK){
                out[t] = points[i];
                t++;
            }
        }

        return out;
    }

    public static int distance(int[] point) {
        return point[0]*point[0] + point[1]*point[1];
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{0, 1}, {1, 0}};
        int K = 2;
        int[][] out = kClosest(points, K);
        for (int i = 0; i < out.length; i++) {
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
