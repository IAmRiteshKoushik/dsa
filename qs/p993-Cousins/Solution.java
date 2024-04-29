
class Solution {
    public boolean isCousins(TreeNode root, int x, int y){
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        // Both nodes should be on the same level
        // Both nodes should not share the same parent
        // Create auxiliary functions to deal with them individually
        return (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy));
    }

    // Function to find the existance of the node
    TreeNode findNode(TreeNode node, int x){
        if(node == null){
            return null;
        }
        // We are provided with the value of the node and not the node itself
        // hence we must traverse through the tree and find the Node containing
        // the required value.
        if(node.val == x){
            return node;
        }
        // Check left subtree and try to find the node
        TreeNode n = findNode(node.left, x);
        if(n != null){
            return n;
        }
        // Check right subtree and try to find the node
        return findNode(node.right, x);
    }

    // Function to check for siblings
    boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
        // pass in the root-node, x-node and y-node
        if(node == null){
            return false;
        }

        // Nodes x and y can be found in (L, R) or (R, L) - case1, case2
        boolean case1 = node.left == x && node.right == y;
        boolean case2 = node.right == x && node.left == y;

        // check for sibling
        boolean case3 = isSibling(node.left, x, y);
        boolean case4 = isSibling(node.right, x, y);
        return case1 || case2 || case3 || case4;
    }

    // Function to find the level of the node
    int level(TreeNode node, TreeNode x, int lev){
        if(node == null){
            return 0;
        }
        // Node found, return the level and stop the recursion
        if(node == x){
            return lev;
        }
        // Check for left subtree 
        int l = level(node.left, x, lev + 1);
        if (l != 0){
            return l;
        }
        // Check for right subtree
        return level(node.right, x, lev + 1);
    }
}
