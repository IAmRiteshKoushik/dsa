import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int n = 5;

        // Dynamic programming array - Memoization
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1)
        // for(int i = 0; i < n + 1; i++){
        //     dp[i] = -1;
        // }

        int res = fibonacciMemo(n, dp);
        System.out.println(Arrays.toString(dp));
        System.out.println(res);

        // Dynamic programming - Tabulation
        

        // Dynamic programming - Space optimization
        fibonacci(6);
    }

    public static int fibonacciMemo(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];

        dp[n] = fibonacciMemo(n - 1, dp) + fibonacciMemo(n - 2, dp);
        return dp[n];
    }

    public static int fibonacciTab(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }

    public static void fibonacci(int n){
        int prev2 = 0;
        int prev = 1;
        for(int i = 2; i <= n; i++){
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        System.out.println(prev);
    }
}
