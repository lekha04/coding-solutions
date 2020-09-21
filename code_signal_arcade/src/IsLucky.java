/*11. Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.*/

public class IsLucky {

    boolean isLucky(int n) {
        int count = 0;
        int num = n;

        while(num>0){
            num = num/10;
            count++;
        }

        int rev = 0;
        int num1 = n;
        while(num1>0){
            rev = rev * 10;
            rev = rev + (num1%10);
            num1 = num1/10;
        }

        int i = 0;
        int sum1=0;
        int sum2=0;

        while(i<count/2){
            sum1 += n%10;
            n = n/10;
            sum2 += rev%10;
            rev = rev/10;
            i++;
        }

        if(sum1==sum2){
            return true;
        }

        return false;
    }

}
