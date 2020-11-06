package LInked;

public class N92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre,cur;
        pre=null;
        cur=head;
        int k=m;
        while(m>1){
            pre=cur;
            cur=cur.next;
            m--;
        }
        ListNode isoHead = cur;
        n = n-k;
        while(n>0){
            cur=cur.next;
            n--;
        }
        ListNode rem = cur.next;
        cur.next=null;
        ListNode rev = getReverse(isoHead);
        if(pre!=null){
            pre.next=rev;
        }else{
            head=rev;
            pre=rev;
        }
        while(rev.next!=null){
            rev=rev.next;
        }
        rev.next=rem;
        return head;
    }
    private ListNode getReverse(ListNode head){
        ListNode pre,cur,next;
        if(head==null){
            return head;
        }
        pre=null;
        cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }

}
