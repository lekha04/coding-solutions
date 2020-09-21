import java.util.Arrays;

public class UglyNumber {

    public static boolean isUgly(int num) {

        if (num <= 0) {
            return false;
        }

        if (num <= 5) {
            return true;
        }

        boolean[] isPrime = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }

        }

        for (int i = 6; i <= num; i++) {
            if (isPrime[i] && num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(isUgly(num));
    }
}
