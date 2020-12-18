package LInked.ReverseLinked;

public class N92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null){
            return null;
        }
        int k=m;
        ListNode pre=null;
        ListNode temp=head;
        while(k>1){
            pre=temp;
            temp=temp.next;
            k--;
        }
        ListNode isoHead = temp;
        n=n-m;
        while(n>0){
            n--;
            temp=temp.next;
        }
        ListNode rev = temp.next;
        temp.next=null;
        isoHead = getReversed(isoHead);
        temp=isoHead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=rev;
        if(pre==null){
            return isoHead;
        }else{
            pre.next=isoHead;
            return head;
        }

    }
    public ListNode getReversed(ListNode head){
        if(head==null){
            return head;
        }
        ListNode pre=null;
        ListNode next=null;
        ListNode cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
