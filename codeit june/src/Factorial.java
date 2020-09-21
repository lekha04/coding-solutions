public class Factorial {

    public static int factorial(int num){
        if(num<=0){
            return 0;
        }

        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){
        int num = 0;
        int out = factorial(num);
        System.out.println(out);
    }
}
