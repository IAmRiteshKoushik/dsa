import java.util.Scanner;

/**
 * Main
 */
public class Main {

    BST tree = new BST();
    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
    tree.populate(nums);
    tree.display();
}
