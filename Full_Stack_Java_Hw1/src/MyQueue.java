// Problem 5. Implement a queue using two stacks
import java.util.*;
public class MyQueue<E> {

    Stack<E> s1;
    Stack<E> s2;

    public MyQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void add(E element){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(element);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public E poll(){
        return s1.pop();
    }

    public E peek(){
        return s1.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public String toString(){
        return s1.toString();
    }

    public static void main(String[] args){
        MyQueue<String> q = new MyQueue();

        q.add("cat");
        q.add("bat");
        q.add("rat");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        q.add("ant");
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
    }

}
