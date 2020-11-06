package LInked;

public class N147 {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur = head;
        while(cur!=null&&cur.next!=null){
            if(cur.val<=cur.next.val){
                cur=cur.next;
            }else{
                ListNode temp = cur.next.next;
                head=insertSingleNode(head,cur.next);
                cur.next=temp;
            }
        }
        return head;
    }
    private ListNode insertSingleNode(ListNode head,ListNode node){
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
            if(node.val<=cur.val){
                if(pre!=null){
                    pre.next=node;
                    node.next=cur;
                    return head;
                }else{
                    node.next=head;
                    return node;
                }
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        return head;
    }
}
