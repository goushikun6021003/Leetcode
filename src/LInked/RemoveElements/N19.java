package LInked.RemoveElements;



public class N19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode();
        ListNode p=dummy;
        ListNode q=dummy;
        dummy.next=head;
        while(n+1>0){
            q=q.next;
            n--;
        }
        while(q!=null){
            p=p.next;
            q=q.next;
        }
        p.next=p.next.next;
        return dummy.next;
    }
}
