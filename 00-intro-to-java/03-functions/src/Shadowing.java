public class Shadowing {

  static int x = 90; // this will be shadowed if a local variable of the same name if 
  // a local variable of the same name is initialized.
  public static void main(String[] args) {
    System.out.println(x); // 90
    int x;
    // System.out.println(x);  // local variable may not be initialized ERROR 
    x = 40;
    System.out.println(x); // 40
    fun();
  }

  static void fun() {
    
    System.out.println(x); // accessed the variable from the global scope (out of main)
  }
}
