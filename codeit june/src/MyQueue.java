//Leetcode 232 - Queue using stack
import java.util.*;
public class MyQueue<E> {
    private Stack<E> s1;
    private Stack<E> s2;

    public MyQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(E ele){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(ele);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public E pop(){
        return s1.pop();
    }

    public E peek(){
        return s1.peek();
    }

    public boolean empty(){
        return s1.isEmpty();
    }

    public String toString(){
        return s1.toString();
    }

    public static void main(String[] args){
        MyQueue<Integer> q = new MyQueue<>();
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        q.push(4);
        System.out.println(q.toString());
        System.out.println(q.peek());
        System.out.println(q.empty());
    }

}
