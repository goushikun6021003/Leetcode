package LInked.MergeList;



public class N143 {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ListNode middle = getMiddle(head);
        ListNode secondList = middle.next;
        middle.next=null;
        ListNode list2 = getReversed(secondList);
        head=merge(head,list2);


    }
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null&&l2==null){
            return null;
        }
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }
        ListNode dummy= new ListNode();
        ListNode cur=dummy;
        while(l1!=null||l2!=null){
            if(l1!=null){
                cur.next=l1; // 不可以 new ListNode 只能l1
                l1=l1.next;
                cur=cur.next;
            }
            if(l2!=null){
                cur.next=l2;
                l2=l2.next;
                cur=cur.next;
            }


        }
        return dummy.next;
    }

    public ListNode getReversed(ListNode head){
        if(head==null){
            return null;
        }
        ListNode pre,next,cur;
        cur=head;
        pre=null;
        next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    public ListNode getMiddle(ListNode head){
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
