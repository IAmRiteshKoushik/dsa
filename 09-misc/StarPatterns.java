public class StarPatterns {
  public static void main(String[] args) {
    pattern1(5); 
  }

  static void pattern1 (int n) {
    for(int row = 1; row <= n; row++){
      for(int col = 1; col <= n; col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //Result 


  static void pattern2 (int n) {
    for (int row = 1; row <= n; row++) {
      // for every row, run the column
      for (int col = 1; col <= row; col++) {
        // Printing out column values (without newline)
        System.out.print("* "); 
      }
      // Printing new line after the completion of every row
      System.out.println();
    }
  }

  static void pattern3 (int n) {
    for(int row = 1; row <= n; row++) {
            
    }
  }
}
