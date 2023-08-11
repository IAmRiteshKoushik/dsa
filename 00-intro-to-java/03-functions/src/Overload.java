import java.util.Arrays;

public class Overload {

  public static void main(String[] args) {

    // First set of examples
    fun(67); 
    fun("Ritesh Koushik");

    // Second set of examples
    int one = sum(2, 3);
    int two = sum(2, 3, 4);
    System.out.println("Results " + one + " Second result " + two);

    // Third set of examples
    demo(1, 2, 3, 5);
    demo("Ritesh", "Rahul", "Rohan");
  }

  // A method can be re-defined multiple times in order to 
  // accomodate different set of arguments (usually with different datatypes)
  
  static void fun(int a){
    System.out.println(a);
  }

  static void fun(String name){
    System.out.println(name);
  }

  // -- Second Example
  static int sum(int a, int b){
    return a + b;
  }
   static int sum(int a, int b, int c){
    return a + b + c;
  }

  // -- Third Example
  static void demo(int ...v){
    System.out.println(Arrays.toString(v));
  }

  static void demo(String ...v){
    System.out.println(Arrays.toString(v));
  }
}
