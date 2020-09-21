//Problem 4. Implement a HashMap in java

import  java.util.*;
public class MyHashMap<K,V> {

    class Node{
        K key;
        V val;

        public Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    List<Node>[] bucket;
    int size;

    public MyHashMap(int size){
        this.size = size;
        bucket = new List[size];
        for(int i=0; i<size; i++){
            bucket[i] = new LinkedList<Node>();
        }
    }

    public void put(K key, V val){
        int hash_value = Math.abs(key.hashCode());
        int index = hash_value%size;
        List<Node> list = bucket[index];
        for(Node n : list){
            if(n.key.equals(key)){
                n.val = val;
                return;
            }
        }
        list.add(new Node(key,val));
    }

    public V get(K key){
        int hash_value = Math.abs(key.hashCode());
        int index = hash_value%size;
        List<Node> list = bucket[index];
        for(Node n : list){
            if(n.key.equals(key)){
                return n.val;
            }
        }
        return null;
    }

    public V remove(K key){
        int hash_value = Math.abs(key.hashCode());
        int index = hash_value%size;
        List<Node> list = bucket[index];
        for(Node n : list){
            if(n.key.equals(key)){
                V v = n.val;
                list.remove(n);
                return v;
            }
        }
        return null;
    }

    public boolean containsKey(K key){
        int hash_value = Math.abs(key.hashCode());
        int index = hash_value%size;
        List<Node> list = bucket[index];
        for(Node n : list){
            if(n.key.equals(key)){
               return true;
            }
        }
        return false;
    }

    public void print(){
        System.out.println("Printing map entries...");
        for(int i=0; i<size; i++){
            List<Node> list = bucket[i];
            if(list.size()>0){
                for(Node n : list){
                    System.out.print("key : " + n.key + "    ");
                    System.out.println("value : " + n.val);
                }
            }
        }
    }

    public static void main(String[] args){
        MyHashMap<String,Integer> map = new MyHashMap<>(7);
        map.put("cat",0);
        map.put("mat", 1);
        map.put("rat",2);
        map.put("cot",3);
        System.out.println(map.get("cat"));
        map.remove("cat");
        System.out.println(map.containsKey("cat"));
        map.print();

    }

}