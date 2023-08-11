import java.util.Scanner;
import java.util.Arrays;

public class twoDArray {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[][] arr = new int[3][3]; // rows = mandatory; columns != mandatory 
    
    // You can create 2D, 3D and arrays of higher dimensions but they are 
    // difficult to visualize. 

    // Example :
    // arr [
    //  [1, 2, 3],
    //  [4, 5, 6],
    //  [8, 9, 10]
    // ]

    // Example 02 : Why column size is not mandatory
    // arr2 [
    //  [1, 2, 3, 4, 5]
    //  [1, 2, 3, 4],
    //  [1, 2, 3],
    //  [1, 2], 
    //  [1]
    // ]

    int[][] arr2 = {
      {1, 2, 3}, // 0th index
      {4, 5},    // 1st index
      {7, 8, 9}  // 2nd index --> arr2[2] = {6, 7, 8, 9}
    };
  
    // input
    for (int row = 0; row < arr.length; row++) {
      // for each col in every rows
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = in.nextInt();
      }
    }
    // output
   for (int row = 0; row < arr.length; row++) {
      // for each col in every rows
      for (int col = 0; col < arr[row].length; col++) {
       System.out.print(arr[row][col] + " ");
      }
      System.out.println("\n");
    } 
    // alternate output
    System.out.println("Printing using normal for-loop and string method");
    for (int row = 0; row < arr.length; row++) {
      System.out.println(Arrays.toString(arr[row])); 
    }
    
    // Using for-each loop
    System.out.println("Printing using forEach loop");
    for (int[] a : arr) {
      System.out.println(Arrays.toString(a));
    }
    in.close();  
  }

}
