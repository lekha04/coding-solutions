import java.util.*;
public class MinimumRemoveToMakeValidParanthesis {
    public static String minRemoveToMakeValid(String s) {
        int n = s.length();
        if(n==0){
            return s;
        }

        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){

            char c = s.charAt(i);

            if(c=='('){
                stack.push(i);
            }

            if(c==')'){
                if(stack.isEmpty()){
                    set.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            set.add(stack.pop());
        }

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<n; i++){
            if(!set.contains(i)){
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

    public static void main(String[] args){
        String s = "lee(t(c)o)de)";
        String out = minRemoveToMakeValid(s);
        System.out.println(out);
    }
}
