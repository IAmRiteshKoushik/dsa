/**
 * WrapperExample
 */
public class WrapperExample {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    Integer num = 45;
    // Primitives are not exactly objects.
    
    // swap(a, b); // This does not work
    // Cannot make a static reference to a non-static method swap()

    System.out.println(a + " " + b);
    
  }

  void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
  }

}
