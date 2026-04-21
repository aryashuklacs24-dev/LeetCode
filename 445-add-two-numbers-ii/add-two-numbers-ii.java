import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);  
            l2 = l2.next;
        }

        int carry = 0;
        ListNode newHead = null;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

            int n1 = s1.isEmpty() ? 0 : s1.pop();
            int n2 = s2.isEmpty() ? 0 : s2.pop();

            int sum = n1 + n2 + carry;   
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }
}