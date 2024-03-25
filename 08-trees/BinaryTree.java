/**
 * Binary Tree Implementation
 */

import java.util.Scanner;

public class BinaryTree {
    // Constructor for tree
    public BinaryTree() {

    }
    
    // Inner class inside a class. This is made static so that it 
    // becomes accessible without having to create an instance of the parent
    // class.
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    // Insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node:"); 
        int value = scanner.nextInt();  // Take an integer
        root = new Node(value);         // Create root-node, left = right = null
        populate(scanner, root);        // Ask for creating children
    }

    // This is similar to offloading things to a helper function of the same
    // name but kept private. (A unique practice in Java programming)
    private void populate(Scanner scanner, Node node){

        // Try populating the left sub-tree 
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean(); // Ask for creating left child
        if (left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value); // Create left child
            populate(scanner, node.left); // Again ask about children (recursion)
        }

        // Try populating the right sub-tree 
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value); // Populate the right child
            populate(scanner, node.left);
        }

        // If you choose not to populate either sides then you return
        // to the previous level of the recursion tree and check for 
        // corresponding calls.
    }

    public void display(){
        display(root, "");
    }

    // Once again, here we are offloading things to a helper function 
    // or an auxiliary function
    private void display(Node node, String indent){
        // Base case for recursion
        if (node == null){
            return;
        }
        // As node is not null.
        System.out.println(indent + node.value); 
        // Proceed to the left-subtree
        display(node.left, indent + "\t");
        // Proceed to the right-subtree
        display(node.right, indent + "\t");
    }

    // Driver code
    public static void main(String[] args) {
        // Creating a scanner object and the binary tree object
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Calling populating functions and display functions
        tree.populate(scanner);
        tree.display();
    } 

}
