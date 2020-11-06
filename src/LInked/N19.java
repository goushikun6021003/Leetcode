package LInked;

public class N19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode();
        ListNode p=dummy;
        ListNode q=dummy;
        dummy.next=head;
        for(int i=0;i < n+1;i++){
            q=q.next;
        }
        while(q!=null){
            p=p.next;
            q=q.next;
        }
        p.next=p.next.next;
        return dummy.next;
    }
}
