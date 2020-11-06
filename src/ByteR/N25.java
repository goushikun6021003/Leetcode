package ByteR;

public class N25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre,next,cur,temp;
        pre=null;
        next=null;
        cur=head;
        temp=head;
        int count=0;
        while(count<k&&temp!=null){
            temp=temp.next;
            count++;
        }
        if(count<k){
            return head;
        }
        count=0;
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
