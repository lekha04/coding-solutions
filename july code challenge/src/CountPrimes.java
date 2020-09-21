public class CountPrimes {

    public static int countPrimes(int n){
        if(n<=2){
            return 0;
        }

        int count = 1;

        for(int i=3; i<n; i++){

            boolean flag = true;

            for(int j=i-1; j>1; j--){
                if(i%j!=0){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int n = 8;
        int out = countPrimes(n);
        System.out.println(out);
    }
}
