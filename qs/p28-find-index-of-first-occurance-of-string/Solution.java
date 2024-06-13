class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;

        // if we reach a point where the index to end size 
        // is smaller that the needle then we need to quit
        // and return -1
        while(needle.length() <= haystack.length() - i){

            // If the first characters match, then we can check for the rest
            // of the characters
            if(haystack.charAt(i) == needle.charAt(0)){
                boolean flag = true;
                for (int j = 1; j < needle.length(); j++){
                    if(haystack.charAt(i + j) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                // Check whether the for-loop ran successfully or not
                if(flag == true) return i;
            }

            // Increment i
            i++;
        }
        return -1;
    }
}
