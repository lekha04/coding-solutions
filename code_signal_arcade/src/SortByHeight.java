/*12.  Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].*/

import java.util.*;

public class SortByHeight {

    int[] sortByHeight(int[] a) {
        int n = a.length;
        int[] out = new int[n];

        System.arraycopy(a,0,out,0,n);

        Arrays.sort(a);

        for(int i=0, j=0; i<n && j<n; i++, j++){
            while(i<n && a[i] == -1){
                i++;
            }

            while(j<n && out[j]==-1){
                j++;
            }

            if(i<n && j<n){
                out[j] = a[i];
            }

        }

        return out;
    }

}
