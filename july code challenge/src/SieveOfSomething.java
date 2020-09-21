//count primes - LeetCode 204
public class SieveOfSomething {
    public static int countPrimes(int n){
        if(n<2){
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }

        int sqrt = (int) Math.sqrt(n);

        for(int i=2; i<=sqrt; i++){
            if(isPrime[i]){
                for(int j=i*i; j<n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        int count =0;

        for(int i=0; i<isPrime.length; i++){
            if(isPrime[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int num = 8;
        System.out.println(countPrimes(num));
    }
}
