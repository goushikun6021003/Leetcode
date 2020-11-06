package ByteR;

public class N160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode curA=headA;
        ListNode curB=headB;
        int lA,lB;
        lA=0;
        lB=0;
        while(curA!=null){
            lA++;
            curA=curA.next;
        }
        while(curB!=null){
            lB++;
            curB=curB.next;
        }
        int dif=Math.abs(lA-lB);
        if(lA>lB){
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
