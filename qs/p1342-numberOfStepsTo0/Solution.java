/**
 * Solution
 */
public class Solution {

    int count = 0;
    public int numberOfSteps(int num){
        if(num == 0){
            return count;
        }
        count++;
        if(num % 2 == 0){
            return numberOfSteps(n / 2);
        }
        return numberOfSteps(n - 1);
    }

    // Alternate : Helper function
    public int numberOfStepsAlt(int num){
        return helper(num, 0);
    }
    private int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
