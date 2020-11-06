package LInked;

public class N143 {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode middle = getMiddle(head);
        ListNode secondList = middle.next;
        middle.next=null;
        ListNode list2 = getReversed(secondList);
        head=merge(head,list2);

    }
    private ListNode merge(ListNode node1, ListNode node2){
        if(node1==null&&node2==null){
            return null;
        }
        if(node1==null||node2==null){
            return node1==null?node2:node1;
        }
        ListNode dummy = new ListNode();
        ListNode cur= dummy;
        while(node1!=null||node2!=null){
            if(node1!=null){
                cur.next=node1;
                cur=cur.next;
                node1=node1.next;
            }
            if(node2!=null){
                cur.next=node2;
                cur=cur.next;
                node2=node2.next;
            }
        }
        return dummy.next;
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
    private ListNode getMiddle(ListNode head){
        if(head==null){
            return head;
        }
        ListNode slow,fast;
        slow = head;
        fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
