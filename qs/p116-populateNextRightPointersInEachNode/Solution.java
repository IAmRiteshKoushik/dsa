class Solution {
    // Given trees are fully balanced and complete
    public Node connect(Node root){
        if(root == null){
            return null;
        }

        Node leftMost = root;
        while(leftMost.left != null){
            Node current = leftMost;
            while(current != null){
                // Joining left and right child
                current.left.next = current.right;
                // If there are more nodes in the same level;
                // bridges are to be formed between the right child
                // of a node and the left child of the node upcoming
                // in the same level.
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                // Moving over to the next element in the same level
                current = current.next;
            }
            // After all the nodes in a level have been tackled
            leftMost = leftMost.left;
        }
        return root;
    }
}
