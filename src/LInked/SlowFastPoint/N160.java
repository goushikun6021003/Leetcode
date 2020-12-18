package LInked.SlowFastPoint;

public class N160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int lengthA=0;
        int lengthB=0;
        while(l1!=null){
            lengthA++;
            l1=l1.next;
        }
        while(l2!=null){
            lengthB++;
            l2=l2.next;
        }
        int diff=Math.abs(lengthA-lengthB);
        if(lengthA>lengthB){
            l1=headA;
            l2=headB;
        }else{
            l1=headB;
            l2=headA;
        }
        while(diff>0){
            l1=l1.next;
            diff--;
        }
        while(l1!=null){
            if(l1==l2){
                return l1;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
}
