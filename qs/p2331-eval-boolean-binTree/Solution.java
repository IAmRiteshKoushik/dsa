class Solution {
    public boolean evaluateTree(TreeNode root) {
        return handle(root) == 1;
    }

    private int handle(TreeNode root){
        // Leaf node detected
        if(root.val == 1 || root.val == 0){
            return root.val;
        }

        // OR gate detected
        if (root.val == 2){
            return handle(root.left) | handle(root.right);
        }
        // AND gate detected
        if(root.val == 3){
            return handle(root.left) & handle(root.right);
        }

        // Dummy return = mandatory for strongly typed langauges
        return 0;
    }
}
