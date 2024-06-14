class Solution {
    // Optimized solution which passes all test-cases
    public int minIncrementForUnique(int[] nums) {

        int moves = 0;
        // Find the max element
        int max = nums[0];
        for(int num: nums){
            max = Math.max(max, num);
        }

        // Create a frequency distribution array
        // The reason why we do max + n is because
        int[] freqArr = new int[max + nums.length];
        for(int num: nums){
            freqArr[num]++;
        }

        for(int i = 0; i < freqArr.length; i++){
            // If frequency is 0, 1 then do not bother
            if (freqArr[i] <= 1) continue;
            // If frequency is > 1 then bother to find the total number of duplicated
            int duplicates = freqArr[i] - 1;
            // Remove the duplicated from the frequency of the array
            freqArr[i] = 1;
            // Upgrade all of the duplicated by +1 which means the frequency of 
            // freqArr[i + 1] = previous-frequency + duplicates
            freqArr[i + 1] += duplicates;
            // Add the duplicates count to number of moves as each duplicate 
            // updation means one move
            moves += duplicates;
        }
        // Returning the total number of moves required
        return moves;
    }

}

// This solution fails for a larger dataset only
class Solution {
    public int minIncrementForUnique(int[] nums) {
        // This solution fails for a larger dataset only
        if(nums.length == 1){
            return 0;
        }


        boolean flag = true;
        int count = 0;
        while(flag == true){

            // Drop the flag and sort the array
            flag = false;
            // Sorting the array after every iteration
            Arrays.sort(nums);


            for (int i = 1; i < nums.length; i++){
                if(nums[i] == nums[i - 1]){
                    nums[i]++;
                    count++;
                    // Pickup the flag if there are alterations
                    flag = true;
                }
            }
        }
        return count;
    }
}
