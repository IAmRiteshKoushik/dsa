class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        // If tree does not exist
        if (root == null){
            return result;
        }

        // If tree exists
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            // Insertion to be done only at 0th index
            result.add(0, currentLevel);
        }
        return result;
    }
}
