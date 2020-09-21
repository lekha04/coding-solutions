import java.util.*;
public class SortStackUsingStack {
    public static Stack<Integer> sortstack(Stack<Integer>  s1){
        Stack<Integer> s2 = new Stack<>();
        int n = s1.size();

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n-i; j++){
                int val = s1.pop();
                min = Math.min(min,val);
                s2.push(val);
            }
            s1.push(min);
            while(!s2.isEmpty()){
                int val = s2.pop();
                if(val!=min){
                    s1.push(val);
                }
            }
        }
        return s1;
    }

    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();
        s1.push(34);
        s1.push(3);
        s1.push(31);
        s1.push(98);
        s1.push(92);
        s1.push(99);
        Stack<Integer> out = sortstack(s1);
        System.out.println(out.toString());
    }

}
