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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode cur=new ListNode();
       ListNode dummy=cur;
       int cy=0;
       while((l1!=null || l2!=null) || cy!=0){
        int v=0;
        if(l1!=null){
            v=l1.val;
            l1=l1.next;
        }

        int u=0;
        if(l2!=null){
            u=l2.val;
            l2=l2.next;
        }

        int sum=v+u+cy;
        ListNode nn=new ListNode(sum%10);
        cy=sum/10;
        cur.next=nn;
        cur=cur.next;
       }
       
       return dummy.next;
        
    }
}