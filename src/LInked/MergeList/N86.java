package LInked.MergeList;



public class N86 {
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
        ListNode lesser = new ListNode();
        ListNode lesserStart = lesser;
        ListNode greater =new ListNode();
        ListNode greaterStart = greater;

        ListNode cur = head;
        while(cur!=null){
            if(cur.val<x){
                lesser.next=new ListNode(cur.val);
                lesser=lesser.next;

            }else{
                greater.next=new ListNode(cur.val);
                greater=greater.next;
            }
            cur=cur.next;
        }

        lesser.next=greaterStart.next;
        return lesserStart.next;
    }
}
