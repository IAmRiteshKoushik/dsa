/**
 * bTree
 */

import java.util.Scanner;

public class bTree {
    
    // Creating inner class
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root; // Root of the binary tree
    public bTree(){}; // Constructor
                      
    // Inserting elements
    public void populate(Scanner scanner){
        System.out.println("Enter root node value:"); 
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root); // Sub-sequent questions are asked for 
                                // populating the entire bTree
    }
    private void populate(Scanner scanner, Node parent){
        // Check availability of left child
        if(parent.left == null){
            System.out.println(String.format("Insert left-child for %s? (true/false) :", parent.value));
            boolean choice = scanner.nextBoolean();
            if(choice == true){
                System.out.println("Enter child node value:");
                int value = scanner.nextInt();
                parent.left = new Node(value);

                // Recursion call for adding further children
                populate(scanner, parent.left);
            }
        }
        if(parent.right == null){
            // Check availability of right child
            System.out.println(String.format("Insert right-child for %s? (true/false) :", parent.value));
            boolean choice = scanner.nextBoolean();
            if(choice == true){
                System.out.println("Enter child node value:");
                int value = scanner.nextInt();
                parent.right = new Node(value);

                // Recursion call for adding further children
                populate(scanner, parent.right);
            }
        }
        return; // If both left and right child are not available
    }

    public void displayTree(){
        displayTree(root, "");
    }
    private void displayTree(Node node, String shiftSpace){
        if(node == null){
            return;
        }

        System.out.println(shiftSpace + node.value);
        // Call to display left node
        displayTree(node.left, shiftSpace + "\t");
        // Call to display right node
        displayTree(node.right, shiftSpace + "\t");
        return;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       bTree tree = new bTree();

       tree.populate(input);
       tree.displayTree(); // Displaying entire tree
    } 
}
