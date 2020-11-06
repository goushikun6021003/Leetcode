package ByteDance;

import java.util.Stack;

public class stackToList {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int num){
        stack1.push(num);
    }
    public  int get(){
        if(stack2.size()==0){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }
}
