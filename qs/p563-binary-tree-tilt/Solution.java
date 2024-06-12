class Solution {

    // Optimized approach:
    // Maintain the tilt as a global variable
    // Update it after from bottom-up while 
    // returning the sum = left + right + node.val
    private int totalTilt = 0;

    public int findTilt(TreeNode root){
        traverse(root);
        return totalTilt;
    }
    private int traverse(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftSum = traverse(node.left);
        int rightSum = traverse(node.right);

        int tilt = Math.abs(leftSum - rightSum);
        totalTilt += tilt;

        return leftSum + rightSum + node.val;
    }

    // Slow solution = My Solution (too much recursion)
    public int findTilt2(TreeNode root) {
        if(root == null){
            return 0;
        }
        int diff = Math.abs(sumOfTree(root.left) - sumOfTree(root.right));
        return diff + findTilt(root.left) + findTilt(root.right);
    }

    private int sumOfTree(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = sumOfTree(node.left);
        int right = sumOfTree(node.right);
        return left + right + node.val;
    }

}
