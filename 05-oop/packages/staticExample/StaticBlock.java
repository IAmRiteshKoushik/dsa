/**
 * StaticInt
 */
public class StaticBlock {

  static int a = 4;
  static int b;

  // The following is a static block
  // This contains the code which is to be run as soon as the class is loaded into 
  // the memory of the program. Unlike constructors, which are loaded every time an
  // object is created. Static blocks are executed only once. 
  
  static {
    System.out.println("I am a static block");
    b = a * 5;
  }

  public static void main(String[] args) {
    StaticBlock obj = new StaticBlock();
    System.out.println(StaticBlock.a + " " + StaticBlock.b); 

    StaticBlock.b += 3;

    System.out.println(StaticBlock.a + " " + StaticBlock.b);

    StaticBlock obj2 = new StaticBlock();
    System.out.println(StaticBlock.a + " " + StaticBlock.b);
  }
}
