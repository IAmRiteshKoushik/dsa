import java.util.Arrays;
/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        int res = altMethod(6, heights);
        System.out.println(res);
    }

    // Memoization Method is used
    // --------------------------
    // n -> number of elements in heights, heights 
    public static int frogJump(int n, int[] heights){
        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);
        return f(n - 1, heights, dp);
    }

    private static int f(int ind, int[] heights, int[] dp){
        if(ind == 0) return 0;
        if(dp[ind] != -1) return dp[ind];

        int left = f(ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
        int right = Integer.MAX_VALUE;
        if(ind > 1){
            right = f(ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);
        }
        return dp[ind] = Math.min(left, right);
    }

    // Tabulation is used 
    // ------------------
    private static int altMethod(int n, int[] heights){
        int[] dp = new int[heights.length];
        Arrays.fill(dp, 0);
        for(int i = 1; i < n; i++){
            int fs = dp[i - 1]  + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1){
                ss = dp[i - 2]  + Math.abs(heights[i] - heights[i - 2]);
            }
            dp[i] = Math.min(fs, ss);
        }
        // The answer is always stored in the last index (n-1)
        return dp[n - 1];
    }

    // Space optimization is used
    // --------------------------
    // Get rid of the array
    private static int spaceOpt(int n, int[] heights) {
        // if we observe a pattern, then we notice that we are constantly 
        // dealing with 3 variables => curr, prev, prev2Prev
        int prev = 0;
        int prev2Prev = 0;
        for(int i = 0; i < n; i++){
            int fs = prev + abs(heights[i] - heights[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1) ss = prev2 + abs(heights[i] - heights[i - 2]);

            int curr = min(fs, ss);
            // variable rotation
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
