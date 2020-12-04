package LInked.移除元素;

public class N82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode cur = head.next;
        ListNode pre = dummy;
        ListNode temp = head;
        boolean flag = false;
        while(cur!=null){
            if(cur.val==temp.val){
                flag=true;

            }else{
                if(flag==true){
                    pre.next=cur;
                    flag=false;
                }else{
                    pre.next=temp;
                    pre=temp;
                }
                temp=cur;
            }
            cur=cur.next;
        }
        if(flag==true){
            pre.next=null;
        }else{
            pre.next=temp;
        }
        return dummy.next;
    }
}
