package LInked.ReverseLinked;

public class N206 {
    /** public ListNode reverseList(ListNode head) {
     if(head==null||head.next==null){
     return head;
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


     }**/
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode next = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return next;


    }
}
