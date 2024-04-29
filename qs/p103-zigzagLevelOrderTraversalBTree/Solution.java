public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();  

        // If the is not tree; return the empty array list
        if(root == null){
            return result;
        }
        // Otherwise add in the root element inside the double-ended queue
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i = 0; i < levelSize; i++){

                // Normal order
                if(!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    // When adding normally, add in the left element
                    // and then add in the right element
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                // Reverse order
                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    // When adding to the first, add in right element
                    // and then add in the left element
                    if(currentNode.right != null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            // Altering the flag after for-loop breaks for a level
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}
