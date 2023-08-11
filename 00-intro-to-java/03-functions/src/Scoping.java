public class Scoping {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

  {
      // int a = 20; // You cannot re-initialize it~
      a = 100;  
      int c = 99;
      // Values initialized within this block will 
      // remain in this block. 

      System.out.println(a); // output = 100
    }

    System.out.println(a); // output = 100 (changes persist)
    System.out.println(c); // cannot use outside block
  }
}


// Summary :
// -- Anything initialized outside the block cannot be re-initialized inside the block
// Anthing initialized inside the block can be re-initialized outside the block
// -- Outside variables can be modified from inside the block
// -- Inside variables cannot be modified from outside the block
