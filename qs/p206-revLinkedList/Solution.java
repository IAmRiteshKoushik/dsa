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

        // Edge case - One Node (or) No Nodes
        if(head == null || head.next == null){
            return head;
        }
        ListNode n1 = null;
        ListNode n2 = head; // Do not change the head
        ListNode n3;

        while(n2.next != null){
            n3 = n2.next; // n3 would move to null if n2.next == null
            n2.next = n1;

            n1 = n2;
            n2 = n3;
        }

        // For reversing the last node
        n2.next = n1;
        head = n2; // Tampering with head at the end

        return head;

    }
}

// Recursive approach would be discussed later
