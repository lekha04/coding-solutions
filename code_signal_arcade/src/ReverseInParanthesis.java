/*13. Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".*/

import java.util.*;

public class ReverseInParanthesis {

    String reverseInParentheses(String inputString) {

        String s = inputString;

        int n = inputString.length();

        Stack<Character> stack = new Stack<>();

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<n; i++){
            while(stack.empty() && i<n && s.charAt(i) != '(' && s.charAt(i)!=')'){
                builder.append(s.charAt(i));
                i++;
            }

            if(i<n && s.charAt(i)=='('){
                stack.push(s.charAt(i));
                continue;
            }

            while(i<n && s.charAt(i) != ')'){
                stack.push(s.charAt(i));
                i++;
            }

            if(i<n && s.charAt(i)==')'){
                StringBuilder temp = new StringBuilder();
                while(!stack.empty()){
                    Character c = stack.pop();
                    if(c=='('){
                        break;
                    }
                    else{
                        temp.append(c);
                    }
                }

                String str = temp.toString();

                if(stack.empty()){
                    builder.append(str);
                    continue;
                }

                for(int j=0; j<temp.length(); j++){
                    stack.push(str.charAt(j));
                }

            }

        }

        return builder.toString();

    }

}
