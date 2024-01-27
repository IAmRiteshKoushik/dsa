//  Factorial Problem
//  Sum to n - natural numbers 

public class secondProblem {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n){
        if (n <= 1){ // Base Condition
           return 1; 
        }
        return n * fact(n - 1); // Recursive condition
    }

    static int sum(int n){
        if (n = 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
