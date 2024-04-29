class Solution {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();

        // If there is no tree
        if(root == null){
            return result;
        }

        // We need to carry out level order traversal and append
        // the last element from each level to the final list of 
        // integers
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();

                // If we are at the last element in a level
                if(i == levelSize - 1){
                    result.add(currentNode.val);
                }

                // Further populating the queue
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }

        return result;
    }
}
