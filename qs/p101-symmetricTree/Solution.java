import java.util.Queue;

// Approach
// 1. Left-Left
// 2. Right-right
// 3. Left-Right
// 4. Right-Left

/**
 * Solution
 */
class Solution {
    public boolean isSymmetric(TreeNode root){
        // We need to check if each level is a palindrome or not 
        // Also, unlike other tree questions where we skip the "null",
        // this time we would have to add it to the queue.

        Queue<TreeNode> queue = new LinkedList<>();
        // We do not need to check for root as there is minimum 1 node
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            // If both are null, then they are symmetric, you can continue
            if(left == null && right == null){
                continue;
            }
            // If both are not null (node exist at one end and not other), 
            // then they are assymetric
            if(left == null || right == null){
                return false;
            }

            // If values do not match, then there are assymetric
            if(left.val != right.val){
                return false;
            }

            // If all the previous checks have passed
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
