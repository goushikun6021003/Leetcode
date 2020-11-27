package ByteR;

import java.util.HashMap;

public class N146 {
    class Node{
        Node pre;
        Node next;
        int val;
        int key;
        public Node(){}
        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    int MaxCapacity=0;
    int CurrentC=0;
    HashMap<Integer,Node> map;
    Node head,tail;
    public void LRUCache(int capacity) {
        map=new HashMap<>();
        MaxCapacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        head.pre=null;
        tail.next=null;
        tail.pre=head;
    }
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        if(node.pre!=head){
            detach(node);
            insertNode(node);
        }
        return node.val;
    }
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            Node node = new Node(key,value);
            map.put(key,node);
            insertNode(node);
            CurrentC++;
            if(CurrentC>MaxCapacity){
                Node del = tail.pre;
                detach(del);
                map.remove(del.key);
                CurrentC--;
            }
        }else{
            Node update = map.get(key);
            update.val=value;
            if(update.pre!=head){
                detach(update);
                insertNode(update);
            }
        }
    }
    public void detach(Node node){
        Node pre=node.pre;
        Node next=node.next;
        pre.next=next;
        next.pre=pre;
        node.pre=null;
        node.next=null;
    }

    public void insertNode(Node node){
        Node old= head.next;
        head.next=node;
        old.pre=node;
        node.pre=head;
        node.next=old;
    }
}
