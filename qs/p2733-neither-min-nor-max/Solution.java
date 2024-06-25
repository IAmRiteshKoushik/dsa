// Finding solution without using sorting techniqus. Fastest way to get it 
// done.
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2) return -1;
        else {
            int max = nums[0], min = nums[0];
            max = Math.max(max, Math.max(nums[1], nums[2]));
            min = Math.min(min, Math.min(nums[1], nums[2]));
            return nums[0] + nums[1] + nums[2] - min - max;
        }
    }
}

// Using a sorting technique like bubble sort is the slowest method to get it 
// done
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int l = nums.length;
        if(l <= 2){
            return -1;
        }
        // As all numbers are distinct use sorting techniques
        for(int i = 0; i < l - 1; i++){
            for(int j = i + 1; j < l; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[1];
    }
}
