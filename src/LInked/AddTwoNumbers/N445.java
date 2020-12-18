package LInked.AddTwoNumbers;
import java.util.*;
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
            int sum = 0;
            sum+=stack1.isEmpty()?0:stack1.pop();
            sum+=stack2.isEmpty()?0:stack2.pop();
            sum+=carry;
            if(sum>=10){
                carry=1;
                sum=sum%10;
            }else{
                carry=0;
            }
            ListNode node = new ListNode(sum);
            node.next=addSum;
            addSum=node;
        }
        if(carry==1){
            ListNode node = new ListNode(1);
            node.next=addSum;
            addSum=node;
        }


        return addSum;
    }
}
