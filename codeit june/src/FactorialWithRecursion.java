public class FactorialWithRecursion {
    public static int factorial2(int num){
        int fact = 1;
        return factorialHelper(fact, num);
    }

    public static int factorialHelper(int fact, int num){
        if(num<=1){
            return fact;
        }

        fact = fact*num;
        num = num-1;
        return factorialHelper(fact, num);
    }

    public static int factorial(int num){
        if(num<=1){
            return 1;
        }

        int fact = num * factorial(num-1);
        return fact;
    }

    public  static void main(String[] args){
        int num = 5;
        int out = factorial(num);
        System.out.println(out);
    }
}
