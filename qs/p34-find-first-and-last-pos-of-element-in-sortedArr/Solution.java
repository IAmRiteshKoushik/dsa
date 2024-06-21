public class Solution {
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // auxiliary function - runs binary search on two halves
    // ans finds if there are more elements which can still be considered as the answer

    //this function just returns the index value of the target
    private int search(int[] nums, int target, boolean findStartIndex){
        // potential answer is -1
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                // potential answer has been found, store it as the answer
                // and then go on finding new answer if it exists. If there 
                // is an answer then your answer variable will get updated and
                // if nothing is found then your answer variable was to be returned
                // anyways.
                ans = mid;
                if(findStartIndex == true){
                    // go on searching in the initial half sub-array
                    end = mid - 1;
                } else {
                    // go on searching in the final half sub-array
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
