public class IsPrime {

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        if(num<=3){
            return true;
        }

        int sqrt = (int) Math.sqrt(num);

        for(int i=2; i<=sqrt; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        int num = 29;
        System.out.println(isPrime(num));
    }
}
