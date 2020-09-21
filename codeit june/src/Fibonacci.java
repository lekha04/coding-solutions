public class Fibonacci {

    public static int fib1(int n){
        if(n<=1){
            return n;
        }
        int first = 0;
        int second = 1;
        int third = 0;

        for(int i=2; i<n; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static int fib(int n){
        if(n==1) {
            return 0;
        }
        if(n==2){
            return 1;
        }

//        if(n<=1){
//            return n;
//        }
       return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args){
        int n=8;
        int out = fib(n);
        System.out.println(out);
    }
}
