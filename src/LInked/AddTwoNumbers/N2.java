package LInked.AddTwoNumbers;



public class N2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addSum = new ListNode();
        ListNode addSumStart = addSum;
        int carry=0;
        while(l1!=null || l2!=null){
            int val1 = (l1==null)? 0:l1.val;
            int val2 = (l2==null)? 0:l2.val;
            int sum = val1+val2+carry;
            if(sum>=10){
                sum=sum%10;
                carry=1;
            }else{
                carry=0;
            }

            addSum.next = new ListNode(sum);
            addSum=addSum.next;
            l1= (l1!=null) ? l1.next : l1;
            l2= (l2!=null) ? l2.next : l2;
        }
        if(carry==1){
            addSum.next = new ListNode(1);
        }
        return addSumStart;
    }
}
