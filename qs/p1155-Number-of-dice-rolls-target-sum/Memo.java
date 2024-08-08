class Solution {
    private static  final int  MOD=(int)Math.pow(10,9)+7;
    public static int solve(int n,int k,int target,int[][] memo){
        // If we run out of target and dice at the same time then we consider 
        // it to be a successful method
        if(target==0 && n==0){
            return 1;
        }
        // If we run out of dice early then we consider it as an unsuccessful 
        // method. If we run out of targets then we are not considering that 
        // option by eliminating it in the for loop
        if(n==0){
            return 0;
        }

        // If memoized matrix has a configuration for reaching every possible
        // target from a given n-number of dices left. If there is a pre-computer
        // value then we use that instead of re-doing the recursion and finding 
        // out the value
        if(memo[n][target]!=-1){
            return memo[n][target];
        }

        // If we do not have a pre-computed value then we must find it ourselves
        // and in order to do so, we are starting a ways variable at every 
        // level of the recursion where we try to see if we can reach the base 
        // condition through a combination of iterating over every possible face
        // at every level and recursively calling the solve() function over 
        // a reduced count of number of dices left and a target reduction. 
        
        // At some point if we run out of dices then the recursion stops and 
        // we are returned back a zero for that particular configuration but 
        // if we run out of target then all the faces will iterate through 
        // 1 ... k and check if any of them are satisfied or not. If they do 
        // satisfy the we report to the memoization matrix that we were not 
        // able to find any ways for the "remaining target" given the 
        // "pending" number of dice-throws and return the ways to the previous
        // level of the recursion tree
        
        int ways=0;
        for(int face=1; face <= k; face++){
            if(face<=target){
                ways=(ways+solve(n-1,k,target-face,memo))%MOD;
            } else {
                // If one face is not lesser than or equal to target then we 
                // can save future iterations by breaking out of the loop
                break;
            }
        }
        memo[n][target]=ways;
        return ways;
    }
    public int numRollsToTarget(int n, int k, int target) {
        int[][] memo=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(memo[i],-1);
        }
        return solve(n,k,target,memo);
    }
}
