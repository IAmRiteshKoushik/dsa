class Solution {

    public boolean isSameTreeAlt(TreeNode p, TreeNode q){
        // Alternate approach to solving the same problem - using simple recursion
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }   

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Brute force approach : Traversing the entire tree and storing all
        // nodes inside an arrayList. After which equality of both arrayLists is 
        // to be compared
        ArrayList<Integer> pTree = new ArrayList<>();
        preOrderTraversal(p, pTree);
        ArrayList<Integer> qTree = new ArrayList<>();
        preOrderTraversal(q, qTree);

        return pTree.equals(qTree);
        
    }

    private void preOrderTraversal(TreeNode node, ArrayList<Integer> orderArr){
        if(node == null){
            orderArr.add(null);
            return;
        }
        orderArr.add(node.val);
        preOrderTraversal(node.left, orderArr);
        preOrderTraversal(node.right, orderArr);
    }
}
