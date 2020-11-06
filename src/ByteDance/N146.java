package ByteDance;

import java.util.HashMap;

public class N146 {
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

    int MaxCapacity;
     int CurrentC=0;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head=new Node(-1,-1);
        tail =new Node(-1,-1);
        head.next=tail;
        head.pre=null;
        tail.next=null;
        tail.pre=head;
        MaxCapacity=capacity;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }else{
            Node node = map.get(key);
            if(node.pre==head){
                return node.value;
            }
            detach(node);
            insertNode(node);
            return node.value;
        }

    }

    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(!map.containsKey(key)){
            map.put(key,node);
            insertNode(node);
            CurrentC++;
            if(CurrentC>MaxCapacity){
                Node deleNode = tail.pre;
                detach(deleNode);
                map.remove(deleNode.key);
                CurrentC--;
            }
        }else{
            Node update = map.get(key);
            update.value=value;
            if(update.pre!=head){
                detach(update);
                insertNode(update);
            }

        }
    }
    private void detach(Node node){
        Node nodeNext =node.next;
        Node nodePre = node.pre;
        nodeNext.pre=nodePre;
        nodePre.next=nodeNext;
        node.pre=null;
        node.next=null;

    }
    private void insertNode(Node node){
        Node oldNode = head.next;
        node.next=oldNode;
        node.pre=head;
        head.next=node;
        oldNode.pre=node;
    }

}
