//Problem 7. Design and Implement Least Recently used cache. LRU cache is to evict older cache elements and to promote elements which are frequently used

//using HashMap and custom designed doubly linked list.
import java.util.*;
public class LRUCache {

    class DLinkedNode{
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    private void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DLinkedNode node){
        removeNode(node);
        addNode(node);
    }

    private DLinkedNode popTail(){
        DLinkedNode popped = tail.prev;
        removeNode(popped);
        return popped;
    }

    Map<Integer, DLinkedNode> cache = new HashMap<>();
    int size;
    int capacity;
    DLinkedNode head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode(-1,-1);
        tail = new DLinkedNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    //returns -1 if the key is absent
    public int get(int key){
        DLinkedNode node = cache.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int val){
        DLinkedNode node = cache.get(key);

        if(node==null){
            DLinkedNode newNode = new DLinkedNode(key, val);
            cache.put(key,newNode);
            addNode(newNode);
            size++;

            if(size>capacity){
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                size--;
            }
        }
        else{
            node.val = val;
            moveToHead(node);
        }
    }

    public void print(){
        System.out.println("Printing Cache....");
        System.out.println("Cache capacity : "+capacity);
        System.out.println("Cache size : "+size);
        DLinkedNode cur = head.next;
        while(cur.val!=-1){
            System.out.println(cur.key+","+cur.val);
            cur = cur.next;
        }
        System.out.println("Done Printing....");
    }

    public static void  main(String[] args){
        LRUCache l = new LRUCache(5);
        l.put(1,10);
        l.put(2,30);
        l.put(3,40);
        l.put(4,70);
        l.put(6,10);
        l.print();
        System.out.println(l.get(1));
        System.out.println(l.get(3));
        l.print();
        l.put(1,50);
        l.print();
        l.put(12,70);
        l.print();
        l.put(5,20);
        l.print();
        System.out.println(l.get(4));

    }

}
