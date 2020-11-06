package LInked;

public class N92R {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode cur,pre;
        cur=head;
        pre=null;
        int k=m;
        while(k>1){
            pre=cur;
            cur=cur.next;
            k--;
        }
        ListNode isoHead = cur;
        n = n-m;
        while(n>0){
            cur=cur.next;
            n--;
        }
        ListNode rem=cur.next;
        ListNode rev=getReversed(isoHead);
        if(pre!=null){
            pre.next=rev;
        }else{
            head=rev;
        }
        while(rev.next!=null){
            rev=rev.next;
        }
        rev.next=rem;
        return head;
    }
    private ListNode getReversed(ListNode head){
        if(head==null){
            return head;
        }
        ListNode cur,pre,next;
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
