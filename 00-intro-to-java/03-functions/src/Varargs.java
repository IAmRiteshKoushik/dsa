import java.util.Arrays;

public class Varargs {

 public static void main(String[] args) {
    fun(2, 3, 4, 5, 6, 7, 8, 9, 10);
    mix(2, 4, "Ritesh", "Koushik", "Rai");
 } 

 static void fun(int ...v){
    // When the number of arguments is not definite
    // The arguemnts are internally stored in an array
    System.out.println(Arrays.toString(v));
  }

  static void mix(int a, int b, String ...v){
    // Variable argument parameter must be the last in the list,
    // it cannot come in between in the argument list
    System.out.println(a + " " + b + Arrays.toString(v));
  }
}
