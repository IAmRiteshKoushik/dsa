class Solution {

    // Optimized Method
    // return s.toLowerCase();

    // Brute Force Method
    public String toLowerCase(String s) {
        String result = "";
        char ch = ' '; // Char cannot be empty

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                ch = (char)(s.charAt(i) + 32);
            }else{
                ch = s.charAt(i);
            }
            result += ch;
        }
        return result;
    }
}
