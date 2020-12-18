package LInked.ReverseLinked;



public class N24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode p = dummy;
        dummy.next=head;
        while(p.next!=null&&p.next.next!=null){
            ListNode node1=p.next;
            ListNode node2=node1.next;
            ListNode next = node2.next;
            node1.next=next;
            node2.next=node1;
            p.next=node2;

            p=node1;
        }
        return dummy.next;
    }
}
