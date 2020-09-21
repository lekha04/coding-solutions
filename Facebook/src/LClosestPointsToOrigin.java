import java.util.*;
public class LClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int K){

        if(K==points.length){
            return points;
        }

        Map<Double, int[]> map = new TreeMap<>();

        for(int i=0; i<points.length; i++){
            double dist = distance(points[i]);
            if(map.containsKey(dist)){
                map.put(dist+0.0001, points[i]);
            }else {
                map.put(dist, points[i]);
            }
        }

        int[][] out = new int[K][2];

            int i=0;
            for(Map.Entry<Double, int[]> entry : map.entrySet()){
                if(i==K) {
                    break;
                }
                out[i] = entry.getValue();
                i++;
            }

            return out;
    }

    public static double distance(int[] point){
        double dist = (point[0] * point[0]) + (point[1] * point[1]);
        dist = Math.sqrt(dist);
        return dist;
    }

    public static void main(String[] args){
        int[][] points = new int[][]{{0,1}, {1,0}};
        int K = 2;
        int[][] out = kClosest(points, K);
        for(int i=0; i<out.length; i++){
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
