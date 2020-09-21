public class KMPStringMatching {


    // n square naive approach
    public static int strstr2(String s, String x) {

        int n = s.length();
        int m = x.length();

        if(s.equals(x)){
            return 0;
        }

        if(m>n){
            return -1;
        }

        char c = x.charAt(0);

        for(int i=0; i<n; i++){
            if(s.charAt(i) == c && i+m<=n){
                String sub = s.substring(i,i+m);
                //System.out.println(sub);
                if(sub.equals(x)){
                    return i;
                }
            }
        }

        return -1;

    }

    //using KMP algorithm . Time : O(m+n) and space O(m)
    public static int strstr(String s, String x){

        int n = s.length();
        int m = x.length();


        int[] table = new int[m];

        buildTable(table, x);

        for(int i=0,j=0; i<n && j<m;){
            if(s.charAt(i) != x.charAt(j)){
                if(j-1 >= 0){
                    j = table[j-1];
                }
                else{
                    j=0;
                    i++;
                }

            }
            else{
                i++;
                j++;
            }

            if (j == m) {
                return i-j;
            }
        }

        return -1;
    }

    public static void buildTable(int[] table, String x){

        int m = x.length();

        table[0] = 0;

        for(int i=0, j=i+1; i<m && j<m;){
            if(x.charAt(i)==x.charAt(j)){
                table[j] = i+1;
                i++;
                j++;
            }
            else{
                table[j] = 0;
                j++;
                i = table[i];
            }
        }
    }

    public static void main(String[] args){
        String s = "adsgwadsxdsgwadsgz";
        String x = "dsgwadsgz";

        int out = strstr(s,x);

        System.out.println(out);
    }

}
