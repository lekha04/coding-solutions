/*46. Elections are in progress!

Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.

The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.*/

import java.util.*;

public class ElectionWinners {

    int electionsWinners(int[] votes, int k) {
        int n = votes.length;

        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            max = Math.max(max, votes[i]);
            int count = map.getOrDefault(votes[i], 0);
            map.put(votes[i], count+1);
        }

        if(k==0){
            if(map.get(max)>1){
                return 0;
            }
            else{
                return 1;
            }
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(!map.containsKey(votes[i]+k) && votes[i]+k > max){
                count++;
            }
        }
        return count;
    }

}
