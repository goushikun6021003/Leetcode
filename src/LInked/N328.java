package LInked;

public class N328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode even = head.next;
        ListNode evenStart = head.next;
        ListNode odd =head;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenStart;
        return head;
    }
}
