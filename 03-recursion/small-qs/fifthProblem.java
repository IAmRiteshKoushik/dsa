public class fifthProblem {
    // Palindrome problem
    public static void main(String[] args) {
        System.out.println(palinCheck(121));
    }

    // Recursion does not mean one recursive function
    // It can mean multiple smaller helper functions too
    // Just for returning true or false
    static boolean palinCheck(int n){
        return (n == rev(n));
    }
    
    static int rev(int n){
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

    // For palindrome checking you can optimize the function by checking
    // only half of the number after finding out the number of digits.
    // This can save some recursion calls and is less intensive on the 
    // memeory
}
