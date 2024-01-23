import java.util.Arrays;

public class Solution {

    public String longestCommonPrefixBRUTE(String[] strs){
        // Brute force method
        // This method was not handling all edge cases

        // Handling edge-cases
        // if there is only 1 string -> return that string
        // if first string is empty, return empty
        if(strs.length == 1 || strs[0].length() == 0){
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            String str = strs[0].substring(0, i); // includes start ONLY
            System.out.println("Currently at: " + str);
            for (int j = 1; j < strs.length; j++) {
                if(str.length() > strs[j]){
                    return str.substring(0, i - 1);
                }
                if(!(strs[j].substring(0, i).equals(str))){
                    return str.substring(0, i - 1);
                }
            }     
        }
        return "";
    }

    public String longestCommonPrefix(String[] v){

        // Optimized method

        StrinBuilder ans = new StringBuilder();
        Arrays.sort(v); // Brilliancy

        String first = v[0];
        String last = v[v.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)){
                return ans;
            }
            ans += first[i];
        }
        return ans
    }


    public static void main(String[] args) {
        // String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs = new String[]{"", ""};
        String res = new Solution().longestCommonPrefix(strs);
        System.out.println(res);
    }
}
