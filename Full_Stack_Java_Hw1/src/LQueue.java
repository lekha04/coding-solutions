//Problem 5.1 : Implement a queue using a linked list

import java.util.*;
public class LQueue<E> {
    List<E> list;

    public LQueue(){
        list = new LinkedList<>();
    }

    public void add(E element){
        list.add(0, element);
    }

    public E poll(){
        return list.remove(list.size()-1);
    }

    public E peek(){
        return list.get(list.size()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }

    public static void main(String[] args){
        LQueue<String> q = new LQueue();

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
