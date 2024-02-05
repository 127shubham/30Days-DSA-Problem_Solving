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
        ListNode current_node = head;
        ListNode previous_node = null;
        ListNode next = null;

        while(current_node != null){
            next = current_node.next;
            current_node.next = previous_node;
            previous_node = current_node;
            current_node = next;
        }
        return previous_node;
        
    }
}