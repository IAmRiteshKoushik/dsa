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
        ListNode head = new ListNode();
        ListNode tail = null;
        int sum = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            if(head.val == 0){
                head.val = sum % 10;
            }
            else{
                tail = new ListNode(sum % 10, null);
                tail = tail.next;
            }
            sum = sum / 10;
       }
       // Residual sum
       while(sum != 0){
           tail.next = new ListNode(sum % 10, null);
           tail = tail.next;
       }
       return head;
    }
}
