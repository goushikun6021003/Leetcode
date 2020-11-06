package LInked;

public class N82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy = new ListNode();// 哑头节点
        ListNode cur = head; // the current node
        ListNode pre = dummy;// the previous unique node
        ListNode temp = head;// the first element of same number(s)
        dummy.next=head;
        cur=cur.next;
        boolean flag = false;
        while(cur!=null){
            if(cur.val==temp.val){
               flag=true;
            }else{
                if(flag){
                    pre.next=cur;
                    flag=false;

                }else{
                    pre.next=temp;
                    pre=pre.next;

                }
                temp=cur;
            }
            cur=cur.next;
        }
        if(flag){
            pre.next=null;
        }else{
            pre.next=temp;
        }

        return dummy.next;
    }
}

