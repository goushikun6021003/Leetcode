package LInked;

import java.util.Stack;

public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
   /** public void sortStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            while(!help.isEmpty()&&help.peek()<temp) {   //只有当pop出来的元素值比help栈顶元素大，才会将help中的元素移回stack
                stack.push(help.pop());
            }
            help.push(temp);    //其他不管是help为空，还是pop出来的元素值比help栈顶小，都是一律push。所以合并写一个就可以，不用再if写情况了
        }

        while(!help.isEmpty()) {     //最后将反序的help压回stack，顺序就对了
            stack.push(help.pop());
        }**/
