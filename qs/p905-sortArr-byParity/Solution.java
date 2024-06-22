// Optimized solution - two pointer approach
// Time = O(N) and Space = O(1) 
class Solution {
    public int[] sortArrayByParity(int[] nums){
        int leftPtr = 0;
        int rightPtr = nums.length - 1;

        while(leftPtr < rightPtr){
            while(leftPtr < rightPtr && nums[leftPtr] % 2 == 0){
                leftPtr++;
            }
            while(leftPtr < rightPtr && nums[rightPtr] % 2 == 1){
                rightPtr--;
            }

            // Swap elemenets with left and right position if they are still 
            // at left and right position .. this handles the edge case where
            // the array is already sorted by parity
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}


class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }

        // Insertion sort solution = slowest solution
        int n = nums.length - 1;
        for(int i = 1; i <= n; i++){
            // if odd the ignore otherwise run checks
            if(nums[i] % 2 == 1) continue;

            int j = i - 1;
            while(j >= 0 && nums[j] % 2 == 1){
                // swap and reduce the count of j
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp; 

                j--;
            }
        }
        return nums;
    }
}
