package LInked.移除元素;

public class N83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur = head;
        while(cur.next!=null){
            if(cur.next.val==cur.val){
                cur.next=cur.next.next;

            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}
