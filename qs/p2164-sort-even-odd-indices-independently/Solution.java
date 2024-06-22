// Brute force solution using Bubble Sort
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length == 0 | nums.length == 1 | nums.length == 2){
            return nums;
        }

        for(int i = 0; i < nums.length; i = i + 2){
            for(int j = i + 2; j < nums.length; j = j + 2){
                if(nums[i] > nums[j]){
                    // ascending order
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 1; i < nums.length; i = i + 2){
            for(int j = i + 2; j < nums.length; j = j + 2){
                if(nums[i] < nums[j]){
                    // descending order
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
