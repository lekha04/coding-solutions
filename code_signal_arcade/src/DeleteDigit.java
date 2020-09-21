/*51. Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.*/

import java.util.*;

public class DeleteDigit {

    int deleteDigit(int n) {
        int num = n;

        List<Integer> list = new ArrayList<>();

        while(num>0){
            list.add(num%10);
            num=num/10;
        }

        int size = list.size();

        for(int i=size-1; i>0; i--){
            if(list.get(i-1)>list.get(i)){
                list.remove(i);
                break;
            }
        }

        if(list.size()==size){
            list.remove(0);
        }

        size = list.size();
        //System.out.println(size);
        int out = 0;
        int p = size-1;

        for(int i=size-1; i>=0; i--){
            out += list.get(i)* (Math.pow(10,p));
            System.out.println(out);
            p--;
        }

        return out;
    }

}
