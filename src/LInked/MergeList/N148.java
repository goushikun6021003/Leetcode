package LInked.MergeList;

public class N148 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode middle = getMiddle(head);
        ListNode l2 = middle.next;
        middle.next=null;
        return merge(sortList(head),sortList(l2));
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
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }
        if(l2!=null){
            cur.next=l2;
        }
        return dummy.next;
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
