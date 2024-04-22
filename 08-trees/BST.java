public class BST {

    public class Node {
        private int value; 
        private int height; // Is auto-initialized to 0
        private Node left;
        private Node right; // Used to determine if it is a balanced BTree 

        // constructor for Node
        public Node (int value) {
            this.value = value;
        }

        // Getter method for getting Node value
        public int getValue() {
            return value;
        }
    }

    // Root node that every tree has (initialized)
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
            node = new Node(value); // Overwrite the NULL value with a new Node
            return node; // Remember: Height variable is initialized to 0 be default
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

        // After insertion, we need to recursively go back and update the 
        // height of each Node. Height is determined by taking the left 
        // and right sub-tree, finding the one that is maximum and then adding
        // 1 to it. Remember : height is calculated from leaf to root
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums){
        // Basically, I am giving you an array and you are supposed to pick 
        // out each element and run the insert function on it.
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    // If the array is sorted, generating a tree is a mess, hence we can try 
    // something  like the following where we are carrying out the insertion
    // using only but the middle-element from the array
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        // Find the middle-element
        int mid = (start + end)/2;
        // 1. Carry out insertion of the middlemost element
        this.insert(nums[mid]);
        // 2. Pass on the left array
        populateSorted(nums, start, mid);
        // 3. Pass on the right array
        populateSorted(nums, mid + 1, end);

            
    }

    // Determining height of each Node
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
        boolean cond2 = balanced(node.left); // Checking left subtree balance
        boolean cond3 = balanced(node.right); // Checking right subtree balance
        return cond1 && cond2 && cond3;
    }

}
