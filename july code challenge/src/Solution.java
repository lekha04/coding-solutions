import java.util.*;

class Solution {
    public List<String> removeComments(String[] source) {
        int n = source.length;
        boolean block = false;
        List<String> list = new ArrayList<>();


        for(String str : source){
            StringBuilder builder = new StringBuilder();
            int bidxe = 0;
            while(true){
                if(!block){
                    int bidxs = str.indexOf("/*");
                    if(bidxs>-1){
                        String substr1 = str.substring(bidxe, bidxs-1);
                        builder.append(substr1);
                        block=true;
                        continue;
                    }
                    else{
                        int cidx = str.indexOf("//");
                        if(cidx>0){
                            String substr2 = str.substring(bidxe,cidx-1);
                            //list.add(substr);
                            builder.append(substr2);
                            break;
                        }
                        else if(cidx<0){
                            builder.append(str);
                            break;
                        }
                        else{
                            break;
                        }
                    }
                }

                if(block){
                    bidxe = str.indexOf("*/");
                    if(bidxe>-1){
                        bidxe += 2;
                        block = false;
                        continue;
                    }
                    else{
                        break;
                    }

                }

            }

            list.add(builder.toString());
        }


        return list;

    }

    static String mergeStrings(String s1, String s2) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            int count = map1.getOrDefault(s1.charAt(i), 0);
            map1.put(s1.charAt(i), count+1);
        }

        for(int i=0; i<s2.length(); i++){
            int count = map2.getOrDefault(s2.charAt(i), 0);
            map2.put(s2.charAt(i), count+1);
        }

        int m = s1.length();
        int n = s2.length();

        int i = 0;
        int j = 0;

        StringBuilder builder = new StringBuilder();

        while(i<m && j<n){
            int count1 = map1.get(s1.charAt(i));
            int count2 = map2.get(s2.charAt(j));

            if(count1 < count2){
                builder.append(s1.charAt(i));
                i++;
            }
            else if(count1 > count2){
                builder.append(s2.charAt(j));
                j++;
            }
            else{
                if(s1.charAt(i)<=s2.charAt(j)){
                    builder.append(s1.charAt(i));
                    i++;
                }
                else{
                    builder.append(s2.charAt(j));
                    j++;
                }
            }
        }

        while(i<m){
            builder.append(s1.charAt(i));
            i++;
        }

        while(j<n){
            builder.append(s2.charAt(j));
            j++;
        }
        return builder.toString();
    }

    int[][] meanGroups(int[][] a) {

        // List<List<Integer>> out = new ArrayList<>();

        Map<Double, List<Integer>> map = new HashMap<>();

        //int[] meanArr = new int[a.length];

        for(int i=0; i<a.length; i++){
            int sum = 0;
            for(int j=0; j<a[i].length; j++){
                sum += a[i][j];
            }
            double mean = (sum*1.0)/a[i].length;
            List<Integer> list = map.getOrDefault(mean, new ArrayList<>());
            list.add(i);
            map.put(mean, list);
        }

        int idx = 0;
        int[][] out = new int[map.size()][];
        for(Map.Entry<Double, List<Integer>> entry : map.entrySet()){
            out[idx] = new int[entry.getValue().size()];
            int j = 0;
            for (int o : entry.getValue()) {
                out[idx][j] = o;
                j++;
            }
            idx ++;
        }

        return out;
    }

    long hashMap(String[] queryType, int[][] query) {

        long out = 0;

        Map<Integer, Integer> map = new HashMap<>(queryType.length);

        for(int i=0; i<queryType.length; i++){
            char[] queryTypeChars = queryType[i].toCharArray();
            if(queryTypeChars[0] == 'i'){
                map.put(query[i][0], query[i][1]);
            }
            else if(queryTypeChars[0] == 'a' && queryTypeChars[5] == 'V'){
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    int num = entry.getValue() + query[i][0];
                    entry.setValue(num);
                }
            }
            else if(queryTypeChars[0] == 'a' && queryTypeChars[5] == 'K'){
                Map<Integer, Integer> temp = new HashMap<>(map.size());
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    int num = entry.getKey() + query[i][0];
                    temp.put(num,entry.getValue());
                }

                map = temp;
            }
            else if(queryTypeChars[0] == 'g'){
                int num = map.get(query[i][0]);
                out += num;
            }

        }

        return out;

    }

    int minDiffOfArrays(int[] a, int[] b) {

        // int min = Integer.MAX_VALUE;

        int sum = 0;
        int[] diff = new int[a.length];
        int[] min = new int[a.length];

        for(int i=0; i<a.length; i++){
            diff[i] = a[i]  - b[i];
            min[i] = Math.abs(diff[i]);
            sum += min[i];
        }

        for(int i=0; i<a.length; i++){
            int temp = min[i];
            for(int j=0; j<a.length; j++){
                // int temp = a[i];
                // a[i] = a[j];
                int val = diff[i] - a[i] + a[j];
                min[i] = Math.min(min[i], Math.abs(val));
                // a[i] = temp;
            }
            int localsum = 0;
            for(int j=0; j<a.length; j++){
                localsum += min[j];
            }
            sum = Math.min(sum, localsum);
            min[i] = temp;
        }

        // int sum = 0;
        // for(int i=0; i<a.length; i++){
        //     sum += min[i];
        // }

        return sum;
    }

    int diff(int[] a, int[] b){

        int diff = 0;

        for(int i=0; i<a.length; i++){
            diff += Math.abs(a[i] - b[i]);
        }

        return diff;
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("dce", "cccbd"));
    }


}



