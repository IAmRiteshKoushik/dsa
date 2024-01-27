// Reverse a number

public class fourthProblem {
    public static void main(String[] args) {
        reverse(12345); // Method 01
        System.out.println("");
        reverse2(12345); // Method 02
        System.out.println(sum); // Answer from method 02
        System.out.println(reverse3(12345)); // Method 03
    } 

    // Method 01 - Printing the digits in reverse (not actual reversal)
    static void reverse(int n){
        if(n % 10 == n){
            System.out.print(n);
            return;
        }
        // Print before recursion happens
        System.out.print(n % 10);
        reverse(n / 10);
    }

    // Method 02 - Require extra variable
    static int sum = 0;
    static void reverse2(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse2(n / 10);
    }

    // Method 03 - 
    // Sometimes you might need some additional variables in the argument 
    // in that case, make another function - helper function
    static int reverse3(int n){
        int digits = (int)(Math.log10(n)) + 1; // Math way to obtain digits
        return helper(n, digits); // Does all the heavy lifting
    }

    private static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
        // Convert to integer as Math.pow returns a long instead of an int
    }
}
