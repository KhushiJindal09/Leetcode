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
    ListNode curr = head;

    while (curr != null) {
        curr = curr.next;      // move curr first
        head.next = prev;      // reverse the link
        prev = head;           // move prev
        head = curr;           // move head
    }

    return prev;
    }
}