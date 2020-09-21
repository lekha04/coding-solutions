/*56. Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.*/

import java.util.*;

public class DigitsProduct {
    int digitsProduct(int product){

        if(product==0){
            return 10;
        }

        if(product>=1 && product<=9){
            return product;
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=9; i>=2 && product>1; i--){
            while(product%i == 0){
                stack.push(i);
                product /= i;
            }
        }

        if(product>1){
            return -1;
        }

        int out = 0;

        while(!stack.empty()){
            out = (out*10) + stack.pop();
        }

        return out;
    }

}
