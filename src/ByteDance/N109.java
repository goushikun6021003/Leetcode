package ByteDance;

public class N109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null || head.next == null) {
            return (head == null ? null : new TreeNode(head.val));
        }
        ListNode slow = head, fast = head, pre = null;
        while(fast!=null && fast.next!=null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(pre!=null) {
            pre.next = null;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }

}
