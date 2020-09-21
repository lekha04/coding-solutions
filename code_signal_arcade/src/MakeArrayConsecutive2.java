/*6. Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.*/

import java.util.*;

public class MakeArrayConsecutive2 {

    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int n = statues.length;
        int count = 0;

        if(n==1){
            return count;
        }

        for(int i=0; i<n-1; i++){
            count += (statues[i+1] - statues[i]) - 1;
        }

        return count;
    }
}
