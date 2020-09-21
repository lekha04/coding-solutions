public class PeakConsideringEdgeElements {

    public static int peakIndexInMountainArray(int[] A){

        int n = A.length;
        if(A[0] > A[1]){
            return 0;
        }

        if(A[n-1] > A[n-2]){
            return n-2;
        }

        for(int i=1; i<n-1; i++){
            if(A[i]>A[i-1] && A[i]>A[i+1]){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] A = new int[]{2,2,1,3,4};
        int out = peakIndexInMountainArray(A);
        System.out.println(out);
    }

}
