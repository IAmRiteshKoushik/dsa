public class BST {

    public class Node {
        private int value; 
        private int height;
        private Node left;
        private Node right;

        public Node (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // Root node that every tree has
    private Node root;

    // Constructor for BST
    public BST(){}
    
    // Public function
    public void insert(int value){
        root = insert(value, root);
    }

    // Private auxiliary function
    private Node insert(int value, Node node){
        // If root does not exist, then make it the root node
        if(node == null){
            node = new Node(value);
            return node;
        }
        // If root exists, check left subtree
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        // If left subtree condition fails then check right subtree
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        // Keep checking both the subtrees recursively and finding the location
        // to insert.

        // The height variable captures the maximum height of right or left 
        // sub-tree by recursively calculating the height of each tree
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public int height(Node node){
        // If node is null
        if(node == null){
            return -1;
            
        }
        return node.height; // Tells height of node, not depth of tree
    }
    public boolean isEmpty() {
        return root == null;
    }

    // Display function with auxiliary private void display() function
    public void display() {
        display(root, "Root Node :"); // Calls the private method
    }

    private void display(Node node, String details){
        // Base case : non-existant node
        if (node == null) {
            return;
        }
        // Recursive case : print out the current node
        // Go over to the left child
        // Go over to the right child
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    // Checking for balanced tree using auxiliary function
    public boolean balanced(){
        return balanced(root);
    }

    // In the auxiliary function, we check if the root node exists or not
    // The we have 3 conditions to check
    // 1. Tree should be right balanced
    // 2. Tree should be left balanced
    // 3. Diff (height(leftNode), height(rightNode)) should not exceed 1
    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        boolean cond1 = Math.abs(height(node.left) - height(node.right)) <= 1;
        boolean cond2 = balanced(node.left);
        boolean cond3 = balanced(node.right);
        return cond1 && cond2 && cond3;
    }
}
