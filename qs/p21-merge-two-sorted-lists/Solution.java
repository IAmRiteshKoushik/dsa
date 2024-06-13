class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null, tail = null;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while(list1 != null && list2 != null){

            // If list has not been initialized yet then initialize it
            if(head == null){
                if(list1.val < list2.val){
                    tail = head = list1;
                    list1 = list1.next;
                } else {
                    tail = head = list2;
                    list2 = list2.next;
                }
            // If list has already been initialized then append to it
            } else {
                if(list1.val < list2.val){
                    tail.next = list1;
                    tail = tail.next;
                    list1 = list1.next;
                } else {
                    tail.next = list2;
                    tail = tail.next;
                    list2 = list2.next;
                }
            }
        }

        // In case one of the lists finish early, we can append the entire 
        // next list into the pointer.
        if(list1 == null){
            tail.next = list2;
        } else {
            tail.next = list1;
        }
    
        return head;
    }
}
