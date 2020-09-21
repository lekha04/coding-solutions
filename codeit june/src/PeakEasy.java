//Leetcode 852
public class PeakEasy {

    public static int peakIndexInMountainArray(int[] A){
        int n = A.length;
        int out = 0;
        for(int i=1; i<n-1; i++){
            if(A[i]>i-1  && A[i]>A[i+1]){
                out = i;
                break;
            }
        }

        return out;
    }

    public static void main(String[] args){
        int[] A = new int[]{0,2,1,0};
        int out = peakIndexInMountainArray(A);
        System.out.println(out);
    }
    }
