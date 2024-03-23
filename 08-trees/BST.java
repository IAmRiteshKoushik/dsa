public class BST {

    public class node {
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

    private Node root;

    // Constructor for BST
    public BST(){}
    
    public int height(Node node){
        if(node == null){
            return -1;
            
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void display() {
        display(root, "Root Node :"); // Calls the private method
    }
    private void display(Node node, String details){
        if (node == null) {
            return;
        }
        System.out.println(details + node.value());
    }
}
