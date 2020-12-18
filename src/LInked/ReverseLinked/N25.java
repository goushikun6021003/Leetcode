package LInked.ReverseLinked;



public class N25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur,pre,next,temp;
        int count=0;
        cur=head;
        pre=null;
        next=null;
        temp=cur;
        while(temp!=null&&count<k){
            count++;
            temp=temp.next;
        }
        if(count<k){
            return head;
        }
        count =0;

        while(cur!=null&&count<k){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
            count++;
        }
        if(next!=null){
            head.next=reverseKGroup(next,k);
        }
        return pre;
    }
}
