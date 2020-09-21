/*14. Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
alternatingSums(a) = [180, 105].*/

public class AlternatingSums {

    int[] alternatingSums(int[] a) {
        int[] out = new int[2];

        int n = a.length;

        int sum1=0;
        int sum2=0;

        for(int i=0,j=1; i<n || j<n; i+=2,j+=2){
            if(i<n){
                sum1+=a[i];
            }

            if(j<n){
                sum2+=a[j];
            }

        }

        out[0]=sum1;
        out[1]=sum2;

        return out;
    }

}
