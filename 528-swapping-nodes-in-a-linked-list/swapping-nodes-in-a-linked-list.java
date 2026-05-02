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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode f=head;
        ListNode s=head;

        for(int i=1;i<k;i++){
            temp=temp.next;
            f=f.next;
        }

        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        int t = temp.val;
        temp.val = s.val;
        s.val = t;
        

        return head;


    }
}