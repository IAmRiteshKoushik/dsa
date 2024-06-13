// Solution which used  lesser memory and was faster due to usage of inbuild
// data structure
class Solution {
    public String clearDigits(String s) {
       StringBuilder sb = new StringBuilder();
       int len = s.length();
       for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') sb.setLength(sb.length()-1);
            else sb.append(ch);
       }
       return sb.toString();
    }
}

// My solution
class Solution {
    public String clearDigits(String s) {
       int i = 0;
       String temp = s;
       while(i < temp.length()){
        if(Character.isDigit(temp.charAt(i))){
            temp = temp.substring(0, i - 1) + temp.substring(i + 1, temp.length());
            i--;
            continue;
        }
        i++;
       } 
       return temp;
    }
}
