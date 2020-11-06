package ByteDance;


public class N160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        ListNode curA=headA;
        ListNode curB=headB;
        while(curA!=null){
            l1++;
            curA=curA.next;
        }
        while(curB!=null){
            l2++;
            curB=curB.next;
        }
        int dif=Math.abs(l1-l2);
        if(l1>=l2){
            curA=headA;
            curB=headB;
        }else{
            curA=headB;
            curB=headA;
        }
        while(dif>0){
            curA=curA.next;
            dif--;
        }
        while(curA!=null&&curB!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;

    }
}
