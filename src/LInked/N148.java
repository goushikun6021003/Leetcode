package LInked;

public class N148 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode middle = middleNode(head);
        ListNode secondList = middle.next;
        middle.next=null;
        return merge(sortList(head),sortList(secondList));
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
    private ListNode merge(ListNode node1,ListNode node2){
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(node1!=null&&node2!=null){
            if(node1.val<=node2.val){
                cur.next=node1;
                node1=node1.next;
            }else{
                cur.next=node2;
                node2=node2.next;
            }
            cur=cur.next;
        }
        if(node1!=null){
            cur.next=node1;
        }
        if(node2!=null){
            cur.next=node2;
        }
        return dummy.next;
    }
}
