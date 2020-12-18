package LInked.ReverseLinked;

public class N61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0){
            return head;
        }
        int length = getLength(head);
        k=k%length;
        if(k==0){
            return head;
        }
        ListNode p,q,dummy;
        dummy = new ListNode();
        dummy.next=head;
        p=dummy;
        q=dummy;
        while(k>0){
            k--;
            q=q.next;
        }
        while(q.next!=null){
            q=q.next;
            p=p.next;
        }
        ListNode start = p.next;
        p.next=null;
        q.next=dummy.next;
        return start;
    }
    public int getLength(ListNode head){
        int l =0;
        while(head!=null){
            l++;
            head=head.next;
        }
        return l;
    }
}
