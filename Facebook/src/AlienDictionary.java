import java.util.*;
public class AlienDictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        int n = words.length;

        if(n<=1){
            return true;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<25; i++){
            map.put(order.charAt(i), i);
        }

        for(int i=0; i<n-1; i++){
            String word1 = words[i];
            String word2 = words[i+1];

            for(int j=0,k=0; i<word1.length() || j<word2.length();){

                if(j==word1.length()){
                    break;
                }

                if(k==word2.length()){
                    return false;
                }

                if(word1.charAt(j)!=word2.charAt(k)){
                    if(map.get(word1.charAt(j)) < map.get(word2.charAt(k))){
                        break;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    j++;
                    k++;
                }


            }

        }
        return true;
    }

    public static void main(String[] args){
        String[] words = new String[]{"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
    }
}
