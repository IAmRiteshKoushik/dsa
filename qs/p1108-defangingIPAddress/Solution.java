/**
 * Solution
 */
public class Solution {

    // Fastest solution
    public String defangIPAddr(String address){
        return address.replace(".", "[.]");
    }

    // Using StringBuilder
    public String defangIPAddrStringBuilder(String address){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
           char ch = address.charAt(i);
           if(ch == '.'){
               s.append("[" + ch + "]")
           }
           s.append(ch);
        }
        return s + ""; // If StringBuilder remains uninitialized, hence add empty string
    }

    // Brute Force
    public String defangIPaddrBRUTE(String address) {
        String defanged = "";
        for(int i = 0; i < address.length(); i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                defanged += "[.]";
                continue;
            }
            defanged += ch;
        }
        return defanged;
    }
}
