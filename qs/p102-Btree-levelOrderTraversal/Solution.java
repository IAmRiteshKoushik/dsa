import java.util.ArrayList;
import java.util.LinkedList;

import com.sun.tools.javac.util.List;

public class Solution {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        // Tree does not exist, return empty list
        if (root == null){
            return result;
        }

        // If tree exists, we create a list of all elements
        Queue<TreeNode> queue = new LinkedList<>();
        // Offer is the enqueue in Java
        queue.offer(root);

        // While the queue is not empty
        while(!queue.isEmpty()){
            int levelSize = queue.size();

            // Taking level
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                // poll is the dequeue in Java
                // We pull out the first element out of the queue
                TreeNode currentNode = queue.poll();

                // We add the value of the element that has been pulled out
                currentLevel.add(currentNode.val);
                // We check if it has a left child, if yes, then we add the 
                // entire node, inside the arrayList
                if (currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                // We check if it has a right child, if yes, then we add the 
                // entire node, inside the arrayList
                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
