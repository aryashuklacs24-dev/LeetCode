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
    public ListNode reverseList(ListNode head) {
        if(head ==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        else{
            ListNode nn=head.next;
            head.next=null;
            ListNode res=reverseList(nn);
            nn.next=head;
            return res;
        }
    }
}