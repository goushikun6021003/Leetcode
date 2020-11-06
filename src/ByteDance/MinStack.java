package ByteDance;


import java.util.PriorityQueue;

public class MinStack {
    int index;
    int size;
    int array[];
    PriorityQueue<Integer> min;
    public MinStack() {
        size=16;
        index=0;
        array=new int[size];
        min= new PriorityQueue<>();
    }

    public void push(int x) {
        if(index==size-1){
            size=size*2;
            int temp[]=new int[size];
            for(int i=0;i<=index;i++){
                temp[i]=array[i];
            }
            array=temp;
        }
        array[index++]=x;
        min.offer(x);
    }

    public void pop() {
        int temp=array[--index];
        if(temp==min.peek()){
            min.poll();
        }
    }

    public int top() {
        return array[index-1];
    }

    public int getMin() {
        return min.peek();
    }
}
