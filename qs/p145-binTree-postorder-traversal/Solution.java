class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    private void traverse(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        traverse(root.left, result);
        traverse(root.right, result);
        result.add(root.val);
    }
}

