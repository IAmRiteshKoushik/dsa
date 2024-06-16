// O(2n) Approach - Frequency Array
class Solution{
    public int firstUniqChar(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            // this operation returns an integer value by subtracting ascii values
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        // Default return
        return -1;
    }
}

// Slightly optimized solution because keeping the entire string in an 
// array instead of using charAt() is less computationally intensive
// Therefore, this solution works despite O(n^2)
class Solution {
    public int firstUniqChar(String s) {
        char arr[]=s.toCharArray();

        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}

// Brute force approach, breaks when the input string is very large
// as time limit exceed for O(n^2). Needs an optimized solution
class Solution {
    public int firstUniqChar(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count = 0; // resetting count after each round
            char ch = s.charAt(i);
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
}
