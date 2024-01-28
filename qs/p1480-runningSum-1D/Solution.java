public class Solution {
    // Recursion is very slow
    // public int[] runningSum(int[] nums){
    //     int[] runningSumArr = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //        runningSumArr[i] = helper(nums, i + 1);
    //     }
    //     return runningSumArr;
    // }
    //
    // private int helper(int[] arr, int pos){
    //     if(pos == 0){
    //         return 0;
    //     }
    //     return arr[pos - 1] + helper(arr, pos - 1);
    // }

    // Iterative solution with extra space
    public int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
           nums[i] = nums[i] + nums[i - 1]; // Adding to prev one
        }
        return nums;
    }
}
