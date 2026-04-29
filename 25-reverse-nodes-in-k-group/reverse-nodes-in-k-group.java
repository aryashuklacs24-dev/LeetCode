class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode start = head;

        while (head != null) {
            while (head != null && st.size() < k) {
                st.push(head);
                head = head.next;
            }
            if (st.size() == k) {
                while (!st.isEmpty()) {
                    temp.next = st.pop();
                    temp = temp.next;
                }
                temp.next = null; 
            } 
            else {
                temp.next = start;
            }
            start = head;
        }
        return dummy.next;
    }
}