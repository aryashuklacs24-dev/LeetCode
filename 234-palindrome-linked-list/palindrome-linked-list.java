/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode nh = reverse(s);

        ListNode front = head;
        ListNode sec = nh;

        while(sec != null){
            if(front.val != sec.val){
                reverse(nh);
                return false;
            }

            front = front.next;
            sec = sec.next;
        }
        reverse(nh);
        return true;
    }

    public static ListNode reverse(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}