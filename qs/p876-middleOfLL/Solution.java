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
    public ListNode middleNode(ListNode head) {

       if(head.next == null){
           return head;
       }

       // If there are more than one element
       ListNode temp = head;
       int count = 1; // Get the count
       while(temp.next != null){
           count++;
           temp = temp.next;
       }
       count /= 2;

        while(count > 0){
            head = head.next;
            count--;
        }

        return head;
    }
}
