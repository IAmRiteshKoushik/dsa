class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Linear search way of doing things
       for(int i = 0; i < letters.length; i++){
           if(target < letters[i]){
               return letters[i];
           }
       }
       return letters[0];
    }
}


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Binary search way of doing things
        int start = 0;
        int end = letters.length - 1;
        
        // This check can be avoided using % N -> which will return first element
        // in case start has reached last element
        
        // if(target > letters[end]){
        //     return letters[0];
        // }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }else {
                // If a match is found or if target is greater than mid, then 
                // we can upgrade the start to mid + 1;
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
