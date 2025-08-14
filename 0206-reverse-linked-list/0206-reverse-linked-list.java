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
        ListNode prev = null;
        ListNode curr  = head;

        while(curr != null){
            ListNode nextNode = curr.next;  // make next node for iteration
            curr.next = prev;               // reverse curr node

            prev = curr;                    // update prev 
            curr = nextNode;                // update curr
        }
        return prev;
    }
}