// Question Link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

class Solution {

    public int findNumbers(int[] nums) {
       int count = 0; 
       for(int item: nums){
           if(even(item)){
               count++;
           }
       }
       return count;
    }

    static boolean even(int num){
        
        if(num < 0){
          num = num * -1;
        }
        if(num == 0){
          return 1;
    }
        
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits % 2 == 0;
        
    }

   // Alternate (Optimized solution)  
    static boolean even2(int num){
    return ((int)(Math.log) + 1) % 2 == 0;
  }
}
