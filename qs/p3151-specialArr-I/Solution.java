class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length <= 1) return true;

        for(int i = 0; i < nums.length - 1; i++){
            // Sum of two odd numbers or two even numbers is even
            if((nums[i] + nums[i + 1]) % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
