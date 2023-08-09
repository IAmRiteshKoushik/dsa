import java.util.Scanner;

public class SumFunc {
  public static void main(String[] args) {
    System.out.println(sum()); 
  }

  // A function with return type specific during defn
  static int sum() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number 1:");
    int num1 = in.nextInt();
    System.out.print("Enter the number 2:");
    int num2 = in.nextInt();
    int sum = num1 + num2;
    // System.out.print("The sum = " + sum);
    return sum;
  }
}
