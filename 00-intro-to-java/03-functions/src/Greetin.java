import java.util.Scanner;

public class Greetin {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter your name");
    String name = in.next();
    String personalized = myGreen(name);
    System.out.print(personalized);

  }

  static String myGreen(String name){
    String message = "hello" + name;
    return message;
  }
  // static void greeting() {
  //   System.out.println();
  // }
}
