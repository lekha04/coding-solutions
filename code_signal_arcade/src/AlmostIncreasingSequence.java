/*7. Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].*/

public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {
        int n = sequence.length;
        int bad = -1;

        for(int i=0; i<n-1; i++){
            if(sequence[i] >= sequence[i+1]){
                bad = i;
                break;
            }
        }

        if(bad==-1){
            return true;
        }

        boolean flag = false;

        for(int i=0; i<n-1; i++){
            if(i==bad){
                continue;
            }
            else if(i+1==bad){
                if(i+2 < n && sequence[i] >= sequence[i+2]){
                    flag = true;
                    break;
                }
            }
            else{
                if(sequence[i] >= sequence[i+1]){
                    flag = true;
                    break;
                }
            }
        }

        if(!flag){
            return true;
        }

        for(int i=0; i<n-1; i++){
            if(i==bad+1){
                continue;
            }
            else if(i+1==bad+1){
                if(i+2 < n && sequence[i] >= sequence[i+2]){
                    return false;
                }
            }
            else{
                if(sequence[i] >= sequence[i+1]){
                    return false;
                }
            }
        }

        return true;
    }

}
