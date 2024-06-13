class Solution {
    public int singleNumber(int[] nums) {
        // XOR gate solution
        int start = 0;
        for(int num: nums){
            start ^= num;
        }
        return start;
    }
}
