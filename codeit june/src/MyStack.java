//Leetcode 225 - StackUsingQueue
import java.util.*;
public class MyStack<E> {
    private Queue<E> q1;
    private Queue<E> q2;

    public MyStack(){
        q1 = new ArrayDeque<>(0);
        q2 = new ArrayDeque<>();
    }

    public void push(E ele){
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(ele);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }

    public E pop(){
        return q1.poll();
    }

    public E top(){
        return q1.peek();
    }

    public boolean empty(){
        return q1.isEmpty();
    }

    public String toString(){
        return q1.toString();
    }

    public static void main(String[] args){
        MyStack<String> s = new MyStack();
        s.push("cat");
        s.push("mat");
        s.push("bat");
        s.pop();
        s.push("rat");
        System.out.println(s.toString());
        System.out.println(s.top());
        System.out.println(s.empty());
    }
}
