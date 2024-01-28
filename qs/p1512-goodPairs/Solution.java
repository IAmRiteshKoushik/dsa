// Space Optimization can be achieved through use of hashmap

// Sacrifice Space for Best Time Complexity
// Constraint in Qs : Max Value = 100 in nums
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[101];
        for(int n: nums){
            arr[n]++;
        }
        int res = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(arr[i] > 1){
                res += arr[i] * (arr[i]-1)/2; // nC2 - Combination
                // BRILLIANCY
                // Number of pairs of one type is number of 
                // combinations that can exist given there is 
                // more than one occurance of the element
            }
        }
        return res;
    }
}

// My Solution
class Solution {
    public int numIdenticalPairs(int[] nums) {
       int good = 0; 
       for(int i =0; i < nums.length; i++){
           for(int j = i + 1; j < nums.length; j++){
               if(nums[i] == nums[j]){
                   good++;
               }
           }
       }
       return good;
    }
}/
