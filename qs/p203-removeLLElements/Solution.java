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

// OPTIMIZED SOLUTION
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // If head reaches null, return null
        if (head == null) return null;

        // If head's value is the required value, shift head
        while (head.val == val){
            head = head.next;

            // If head becomes null because of that return head else
            // while loop will generate error
            if (head == null) return null;
        }

        // If head element is fine, then we move on to next element
        // and run the function recursively by considering the 
        // next element as head and so on.
        head.next = removeElements(head.next, val);
        return head;
    }
}

// BRUTE FORCE SOLUTION
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handling the head edge case
        while (head!=null && head.val==val){
            head=head.next; // This can be a null value if next element does not exist
        }

        // The head element is no more the target
        ListNode current=head;  
        while(current!=null && current.next!=null){
            // Pointer stays one step behind the value of deletion
            // If value matches
            if(current.next.val==val){
                current.next=current.next.next;
            }
            // If value does not match
            else{
                current=current.next;
            }
        }
        return head;
    }
}
