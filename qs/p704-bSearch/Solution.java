class Solution {
    public int search(int[] nums, int target) {
        
        // Time complexity of usual binary search is O(logn)    
        int l = 0;
        int h = nums.length - 1;
        int mid = -1;
        // Edge Case
         if(nums[0] == target){
             return 0;
         }
        while(l <= h){
            mid = l + (h - l) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                h = mid - 1;
            }else{
                l = mid + 1;
            }

        }
        return -1;

    }
}
