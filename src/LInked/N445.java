package LInked;

import java.util.Stack;

public class N445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode addSum = null;

        while(!stack1.isEmpty()||!stack2.isEmpty()){
            int sum =carry;

            sum += stack1.isEmpty()?0:stack1.pop();
            sum += stack2.isEmpty()?0:stack2.pop();
            carry=sum/10;
            ListNode cur = new ListNode(sum%10);
            cur.next= addSum;
            addSum=cur;
        }
        if(carry==1){
            ListNode cur = new ListNode(1);
            cur.next= addSum;
            addSum=cur;
        }
        return addSum;
    }
}
