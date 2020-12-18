package LInked.SlowFastPoint;

public class N234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode l1=head;
        ListNode middle = getMiddle(head);
        ListNode l2=middle.next;
        l2=getReversed(l2);
        middle.next=null;
        while(l1!=null&&l2!=null){
            if(l1.val!=l2.val){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;




    }
    public ListNode getMiddle(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode getReversed(ListNode head){
        ListNode pre,next,cur;
        pre=null;
        next=null;
        cur=head;
        while(cur!=null){
            next= cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
