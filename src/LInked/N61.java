package LInked;

public class N61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length = getLength(head);
        k=k%length;
        if(k==0||k==length){
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode p = dummy;
        ListNode q = p;
        p.next=head;
        for(int i=0;i<k+1;i++){
            q=q.next;
        }
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        ListNode node = p.next.next;
        p.next.next=null;
        //while(node!=null&&node.next!=null){
          //  node=node.next;
        //}
        q.next=dummy.next;
        return node;
    }
    public int getLength(ListNode head){
        int l=0;
        while(head!=null){
            l++;
            head=head.next;
        }
        return l;
    }
}
