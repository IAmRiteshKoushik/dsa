import java.util.Scanner;
import java.lang.Math;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q : Find the largest of the 3 numbers
        
        // Method 01 -- 
        // int max = a;

        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }
        
        // Method 01 --
        int max = Math.max(c, Math.max(a, b));
        
        System.out.println("Largest : " + max);
        
    }
}