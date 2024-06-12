class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }

        // Balance factor
        int factor = height(root.left) - height(root.right);
        if (factor < -1 || factor > 1){
            return false;
        }
        // Checks continue on each level as root may be balanced but sub-levels
        // may not be balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftSubtree = height(node.left);
        int rightSubtree = height(node.right);


        return 1 + Math.max(leftSubtree, rightSubtree);
    }

    public boolean isBalancedAlt(TreeNode root){
        // Alternate approach - is more optimized because in-case balance 
        // happens at one level then it returns -1 and does not check any further.
        // With the previous approach, height was recalculated at each level and 
        // balancing was checked.
        int a = check(root);
        if (a == -1) return false;
        return true;
    }

    private int check(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = check(node.left);
        int right = check(node.right);

        // Chain the negative response in-case either 
        // left or right subtree is imbalanced
        if(left == -1 || right == -1) return -1;

        // Returning negative number in case of imbalance 
        // Else return height
        if(Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }

}
