package ByteDance;

import java.util.HashMap;

public class N146R {
    class Node{
        Node pre;
        Node next;
        int key;
        int value;
        public Node(){}
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public void add(Node node){
        node.pre=head;
        node.next=head.next;
        head.next.pre=node;
        head.next=node;
    }
    public void delete(Node node){
        Node pre=node.pre;
        Node next = node.next;
        pre.next=next;
        next.pre=pre;
    }
    public void moveHead(Node node){

        delete(node);
        add(node);
    }
    public Node popTail(){
        Node node = tail.pre;
        delete(node);
        return node;
    }



    HashMap<Integer,Node> Cache;
    int capacity;
    int size;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        size=0;
        Cache = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next=tail;
        tail.next=head;
    }

    public int get(int key) {
        Node node = Cache.get(key);
        if(node==null){
            return -1;
        }
        moveHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = Cache.get(key);
        if(node==null){
            Node newNode = new Node(key,value);
            add(newNode);
            Cache.put(key,newNode);
            size++;
            if(size>capacity){
                Node pop = popTail();
                Cache.remove(pop.key);
                size--;
            }
        }else{
            node.value=value;
            moveHead(node);

        }
    }
}
