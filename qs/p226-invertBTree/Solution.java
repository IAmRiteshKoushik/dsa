class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Inverting a binary tree by swapping left and right subtree and then
        // recursively calling the function on left and right subtree so that 
        // everything inverts till the leaf nodes
        if(root == null){
            return root;
        }

        // Swapping logic
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Calling the function recursively on left and right-subtree
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        return root;
    }
}
