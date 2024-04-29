public class Solution {
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();

        // If tree does not exist, then return an empty list
        if (root == null){
            return result;
        }

        // Create a queue to carry out level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        // A Note on Java Queues:
        
        // -- ENQUEUE :
        // 1. add(e) -> throws exception if it fails to insert the object
        // 2. offer(e) -> returns false if it fails to insert the object
        
        // -- DEQUEUE :
        // 3. remove() -> throws exception if the queue is empty
        // 4. poll() -> returns null if the queue is empty
        
        // -- FOR LOOKING INTO THE FIRST OBJECT IN QUEUE :
        // 5. element() -> throws exception if the queue is empty
        // 6. peek() -> returns null if the queue is empty
        
        // throw the root inside the queue
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double averageLevel = 0;
            for(int i = 0; i < levelSize; i++){
                // Removes the current node
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.val;
                // Add left child
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                // Add right child
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }
        return result;
    }
}
