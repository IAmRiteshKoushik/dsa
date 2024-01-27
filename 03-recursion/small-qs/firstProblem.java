// Simple printing to understand outputs on the way 
// and outputs when returned 

public class firstProblem {
    public static void main(String[] args) {
        printNumbers(5);
        System.out.println("Next function");
        printNumbersRev(5);
    }

    static void printNumbers(int n){
        if(n == 0){ // Base Condition
            return;
        }
        System.out.println(n); // Print happens on the way forward
        printNumbers(n - 1); // Recursive Condition 
    }

    static void printNumbersRev(int n){
        if(n == 0){ // Base Condition
            return;
        }
        printNumbersRev(n - 1); // Recursive Condition
        System.out.println(n); // Printing happens on the way back
    }

    static void printNumbersBoth(int n){
        if (n == 0) {
            return 
        }
        System.out.println(n); // Numbers are printed when calls are added to the stack
        printNumbersBoth(n - 1);
        System.out.println(n); // Numbers are print when calls are removed from the stack
    }
}
