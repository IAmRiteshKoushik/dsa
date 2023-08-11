/**
 * PrimeNumber
 */
import java.util.Scanner;

public class PrimeNumber {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean ans = isPrime(n);
    System.out.println(ans);
  }

  static boolean isPrime(int n){
    if (n <= 1) {
      return false;
    }
    // Sqaures method to check for prime number.
    int c = 2;
    while(c * c <= n){
      if (n % c == 0){
        return false;
      }
      c++;
    }
    // return true; // this also works 
    return c * c > n; 
    // true value if we reach a pt where there isn't any number whose
    // square is less than or equal to n; then it is a prime number.
  }
}
