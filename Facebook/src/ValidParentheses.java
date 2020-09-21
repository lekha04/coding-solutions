import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s){
        int n = s.length();
        if(n==0){
            return true;
        }
        if(n%2!=0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++){
            char c1 = s.charAt(i);
            if(c1=='(' || c1=='[' || c1=='{'){
                stack.push(c1);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char c2 = stack.pop();
                if(c1==')' && c2!='('){
                    return false;
                }
                else if(c1==']' && c2!='['){
                    return false;
                }
               else if(c1=='}' && c2!='{'){
                    return false;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        String s = "[({()})[]}";
        boolean out = isValid(s);
        System.out.println(out);
    }
}
