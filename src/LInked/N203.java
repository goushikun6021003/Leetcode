package LInked;



public class N203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = null;
        ListNode cur = dummy;
        dummy.next=head;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}
