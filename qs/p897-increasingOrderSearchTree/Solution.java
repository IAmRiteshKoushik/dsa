class Solution {

    // Using a global pointer
    TreeNode temp;

    public TreeNode increasingBST(TreeNode root){
        TreeNode head = new TreeNode();
        temp = head;     // Temp -> head
        readTree(root);
        return head.right; // first element is empty
    }  

    private void readTree(TreeNode node){
        if(node == null) return;

        // In-order traversal
        readTree(node.left);

        temp.right = new TreeNode(node.val);
        temp = temp.right;

        readTree(node.right);
    }
}
