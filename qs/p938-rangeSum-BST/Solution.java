class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // If root is null (after leaf-node) then return 0
        if(root == null){
            return 0;
        }
        // If root within range then add root and recursively call left and right subtree
        if(root.val >= low && root.val <= high){
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        // If root not within range then just recursively call left and right subtree
        return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
