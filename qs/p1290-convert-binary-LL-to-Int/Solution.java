class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head != null){
            sum *= 2 + head.val;
            head = head.next;
        }
        return sum;
    }
}
