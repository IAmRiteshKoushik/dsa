class Solution {
    public ListNode deleteDuplicates(ListNode node) {
        // Reach end of LL
        if(node == null){
            return null;
        }
        if(node.next == null){
            return node;
        }

        // Checking for consecutive values
        // if they are consecutively same then we 
        // keep shifting shift
        // Case : [1, 1, 1, 1, 2]
        // Case : [1, 1, 1]
        while(node.next != null){
            if(node.next.val == node.val){
                node = node.next;
            } else {
                break;
            }
        }

        // After removal, calling the delete() function 
        // recursively on the next node
        node.next = deleteDuplicates(node.next);
        return node;
    }
}
