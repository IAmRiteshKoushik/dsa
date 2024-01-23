public class Solution {
    public int removeduplicates(int[] nums){
        int counter = 1; // atleast one element is original (given that array not empty)
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                counter++;
                nums[counter - 1] = nums[i] // Substitute to sort array (don't care about other elements)
            }
        }
        return counter; // you need not actually sort the array
    }
}
