import java.util.*;
public class TopKFrequentWords {

    static class Pair{
        String word;
        int count;
    }

    public static String[] topKFrequent(int k, String[] keywords, String[] reviews){
        Map<String,Integer> map = new HashMap<>();

        for(String s : reviews){
            String[] temp = s.split("\\s");

            for(String str : temp){
                int count = map.getOrDefault(str,0);
                map.put(str,count+1);
            }
        }

        List<Pair> list = new ArrayList<>();

        for(String s : keywords){
            if(map.containsKey(s)){
                Pair p = new Pair();
                p.word = s;
                p.count = map.get(s);
                list.add(p);
            }
        }

        Collections.sort(list, (a,b) -> {
            int out = b.count - a.count;
            return out==0 ? a.word.compareTo(b.word) : out;
        });

        String[] out = new String[k];

        for(int i=0; i<k; i++){
            out[i] = list.get(i).word;
        }

        return out;
    }

    public static void main(String[] args){
        int k = 2;
        String[] keywords = new String[]{"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
        String[] reviews = new String[]{"I love anacell Best services; Best services provided by anacell",
                "betacellular has great services",
                "deltacellular provides much better services than betacellular",
                "cetracular is worse than anacell",
                "Betacellular is better than deltacellular"};

        String[] out = topKFrequent(k,keywords,reviews);

        System.out.println(Arrays.toString(out));
    }
}
