package LInked;

public class N234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode middle = middleNode(head);
        ListNode secondList = middle.next;
        middle.next=null;
        secondList=getReversed(secondList);
        while(secondList!=null){
            if(head.val!=secondList.val){
                return false;
            }else{
                head=head.next;
                secondList=secondList.next;
            }
        }
        return true;
    }

    private ListNode middleNode(ListNode head){
        if(head==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode getReversed(ListNode head){
        if(head==null){
            return head;
        }
        ListNode pre,cur,next;
        cur=head;
        pre=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
